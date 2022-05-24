package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.*;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.ParametrosBusquedaFactura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.FrontEntities.Factura;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BuscarFacturas implements ModuleRunnable {

    @Autowired
    private DataBroker broker;

    @Override
    public Object run(RequestMessage message) throws AuthorizationRequiredException {
        if (message.getCredentials().isEmpty()) {
            throw new AuthorizationRequiredException();
        }
        ParametrosBusquedaFactura parametrosBusquedaFactura = (ParametrosBusquedaFactura) message.getParams();
        List<EventoEntity> eventos;
        List<Factura> facturas = new ArrayList<>();
        switch (parametrosBusquedaFactura.getTipoBusqueda()) {
            case EVENTO:
                eventos = broker.requerirEventos(message.getCredentials().get().getFamiempresaID(), "FACTURA");
                break;
            case EVENTOFECHA:
                try {
                    eventos = broker.requerirEventosPorFecha(message.getCredentials().get().getFamiempresaID(), "FACTURA", DateFromFront.format(parametrosBusquedaFactura.getFecha()));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                eventos = new ArrayList<>();
        }
        for (EventoEntity evento :
                eventos) {
            facturas.add((Factura) Kernel.processRequest("factura.consolidarFactura", new RequestMessage(evento)).run());
        }
        return facturas;
    }
}
