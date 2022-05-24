package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.ConsolidadoBuilder;
import co.edu.javeriana.seshat.sofiplus.DataFacade.ConsolidadoBuilderFactory;
import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.DataFacade.ReaDetallesBuilder;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.DateFromFront;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.ModuleMethod;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadataRepository;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.FrontEntities.Factura;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.text.ParseException;

@ModuleMethod
public class CrearFactura implements ModuleRunnable {

    @Autowired
    private DataBroker broker;
    @Autowired
    private ConsolidadoBuilderFactory consolidadoFactory;

    @Autowired
    private FacturaMetadataRepository facturaMetadataRepository;

    @Override
    public Object run(RequestMessage message) throws AuthorizationRequiredException {
        try {
            if (message.getCredentials().isEmpty()) {
                throw new AuthorizationRequiredException();
            }
            Factura factura = (Factura) message.getParams();
            EventoEntity evento = new EventoEntity();
            evento.setNitFamiempresa(message.getCredentials().get().getFamiempresaID());
            evento.setIdEvento(factura.getId());
            evento.setFecha(new Timestamp(DateFromFront.format(factura.getFecha()).getTime()));
            evento.setAgenteInterno(message.getCredentials().get().getId());
            evento.setAgenteExterno(factura.getClienteID());
            evento.setTipoEvento("FACTURA");
            ReaDetallesBuilder reaBuilder = new ReaDetallesBuilder(factura.getId(), message.getCredentials().get().getFamiempresaID());
            ConsolidadoBuilder consolidadoBuilder = consolidadoFactory.getBuilder(message.getCredentials().get().getFamiempresaID());
            if (factura.getTotalItems() > 0) {
                reaBuilder.restar("14", factura.getCostoTotal()).sumar("6195", factura.getTotalItems());
                consolidadoBuilder.restar("14", factura.getCostoTotal()).sumar("6195", factura.getTotalItems());
            }
            if (factura.getTotalServicios() > 0) {
                reaBuilder.sumar("4195", factura.getTotalServicios());
                consolidadoBuilder.sumar("4195", factura.getTotalServicios());
            }
            reaBuilder.sumar("1105", factura.getTotal());
            consolidadoBuilder.sumar("1105", factura.getTotal());
            consolidadoBuilder.ejecutar();
            FacturaMetadata metadata = new FacturaMetadata(factura.getId(), factura.getDetalles(), DateFromFront.formatUtilDate(factura.getFecha()), DateFromFront.formatUtilDate(factura.getFechaVencimiento()), factura.getTipoPago(), factura.getTotal(), factura.getCostoTotal(), factura.getTotalItems(), factura.getTotalServicios());
            broker.registrarRea(evento, reaBuilder.getDetalles());
            facturaMetadataRepository.save(metadata);
            return factura;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
