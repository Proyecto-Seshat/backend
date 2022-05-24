package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.ConsolidadoBuilder;
import co.edu.javeriana.seshat.sofiplus.DataFacade.ConsolidadoBuilderFactory;
import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.DataFacade.ReaDetallesBuilder;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.DateFromFront;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities.DevolucionMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities.DevolucionMetadataRepository;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.FrontEntities.Devolucion;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.text.ParseException;

public class CrearDevolucion implements ModuleRunnable {

    @Autowired
    private DataBroker broker;
    @Autowired
    private ConsolidadoBuilderFactory consolidadoFactory;

    @Autowired
    private DevolucionMetadataRepository devolucionMetadataRepository;

    @Override
    public Object run(RequestMessage message) throws AuthorizationRequiredException {
        try {
            if (message.getCredentials().isEmpty()) {
                throw new AuthorizationRequiredException();
            }
            Devolucion devolucion = (Devolucion) message.getParams();
            EventoEntity evento = new EventoEntity();
            evento.setNitFamiempresa(message.getCredentials().get().getFamiempresaID());
            evento.setIdEvento(devolucion.getId());
            evento.setFecha(new Timestamp(DateFromFront.format(devolucion.getFecha()).getTime()));
            evento.setAgenteInterno(message.getCredentials().get().getId());
            evento.setAgenteExterno(devolucion.getClienteID());
            evento.setTipoEvento("DEVOLUCION");
            ReaDetallesBuilder reaBuilder = new ReaDetallesBuilder(devolucion.getId(), message.getCredentials().get().getFamiempresaID());
            ConsolidadoBuilder consolidadoBuilder = consolidadoFactory.getBuilder(message.getCredentials().get().getFamiempresaID());
            if (devolucion.getTotalItems() > 0) {
                reaBuilder.sumar("14", devolucion.getCostoTotal()).restar("6195", devolucion.getTotalItems());
                consolidadoBuilder.sumar("14", devolucion.getCostoTotal()).restar("6195", devolucion.getTotalItems());
            }
            if (devolucion.getTotalServicios() > 0) {
                reaBuilder.restar("4195", devolucion.getTotalServicios());
                consolidadoBuilder.restar("4195", devolucion.getTotalServicios());
            }
            reaBuilder.sumar("1105", devolucion.getTotal());
            consolidadoBuilder.sumar("1105", devolucion.getTotal());
            consolidadoBuilder.ejecutar();
            DevolucionMetadata metadata = new DevolucionMetadata(devolucion.getId(), devolucion.getDetalles(), DateFromFront.formatUtilDate(devolucion.getFecha()), DateFromFront.formatUtilDate(devolucion.getFechaVencimiento()), devolucion.getTipoPago(), devolucion.getTotal(), devolucion.getCostoTotal(), devolucion.getTotalItems(), devolucion.getTotalServicios());
            broker.registrarRea(evento, reaBuilder.getDetalles());
            devolucionMetadataRepository.save(metadata);
            return devolucion;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
