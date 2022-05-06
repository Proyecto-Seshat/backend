package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.ReaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class TestFactura implements ModuleRunnable {

    @Autowired
    DataBroker broker;

    @Autowired
    FacturaMetadataRepository facturaMetadataRepository;

    @Override
    public Object run(HashMap<String, Object> params) {
        UUID eventoId = UUID.randomUUID();
        EventoEntity evento = new EventoEntity();
        evento.setIdEvento(eventoId.toString());
        evento.setNitFamiempresa((String) params.get("nitFamiempresa"));
        evento.setAgenteInterno((String) params.get("agenteInterno"));
        evento.setAgenteExterno((String) params.get("agenteExterno"));
        evento.setFecha(new Timestamp(new Date().getTime()));
        evento.setTipoEvento("FACTURA");
        ReaEntity reaEntity = new ReaEntity();
        reaEntity.setIdEvento(eventoId.toString());
        reaEntity.setNitFamiempresa((String) params.get("nitFamiempresa"));
        reaEntity.setIdRecurso((String) params.get("idRecurso"));
        reaEntity.setAfectacion(Double.parseDouble(params.get("afectacion").toString()));
        ReaEntity[] details = new ReaEntity[]{reaEntity};
        broker.registerRea(evento, details);
        FacturaMetadata facturaMetadata = new FacturaMetadata();
        facturaMetadata.setCarrito(new ArrayList<>());
        facturaMetadata.setFecha(new Date());
        facturaMetadata.setFechaVencimiento(new Date());
        facturaMetadata.setTipoPago(true);
        facturaMetadata.setTotal(Double.parseDouble(params.get("afectacion").toString()));
        facturaMetadata.setId(eventoId.toString());
        facturaMetadataRepository.save(facturaMetadata);
        return "Ok";
    }
}
