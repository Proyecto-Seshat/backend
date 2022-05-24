package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntityPK;
import co.edu.javeriana.seshat.sofiplus.Kernel.*;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BuscarFactura implements ModuleRunnable {

    @Autowired
    private DataBroker broker;

    @Autowired
    FacturaMetadataRepository facturaMetadataRepository;

    @Override
    public Object run(RequestMessage message) throws AuthorizationRequiredException {
        if (message.getCredentials().isEmpty()) {
            throw new AuthorizationRequiredException();
        }
        String idFactura = (String) message.getParams();
        Optional<EventoEntity> eventoOptional = broker.requerirEvento(new EventoEntityPK(idFactura, message.getCredentials().get().getFamiempresaID()));
        if (eventoOptional.isEmpty()) {
            return eventoOptional;
        }
        return Kernel.processRequest("factura.consolidarFactura", new RequestMessage(eventoOptional.get())).run();
    }
}
