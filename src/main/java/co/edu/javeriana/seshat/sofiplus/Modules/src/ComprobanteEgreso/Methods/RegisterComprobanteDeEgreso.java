package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.ModuleMethod;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCajaMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

@ModuleMethod
public class RegisterComprobanteDeEgreso implements ModuleRunnable {
    @Autowired
    DataBroker broker;

    @Autowired
    ReciboDeCajaMetadataRepository repo;
    @Override
    public Object run(RequestMessage message) {
//        ComprobanteDeEgreso comprobanteDeEgreso = new ComprobanteDeEgreso();
//        ComprobanteDeEgresoMetadata meta = new ComprobanteDeEgresoMetadata();
//        UUID eventoId = UUID.randomUUID();
//        EventoEntity evento = new EventoEntity();
//        evento.setIdEvento(eventoId.toString());
//        evento.setNitFamiempresa((String) params.get("nitFamiempresa"));
//        evento.setAgenteInterno((String) params.get("agenteInterno"));
//        evento.setAgenteExterno((String) params.get("agenteExterno"));
//        evento.setFecha((Timestamp) params.get("tipoComprobante"));
//
//        ReaEntity reaEntity = new ReaEntity();
//        reaEntity.setIdEvento(eventoId.toString());
//        reaEntity.setNitFamiempresa((String) params.get("nitFamiempresa"));
//        reaEntity.setIdRecurso((String) params.get("idRecurso"));
//        reaEntity.setAfectacion(Double.parseDouble(params.get("afectacion").toString()));
//        ReaEntity[] details = new ReaEntity[]{reaEntity};
//        broker.registerRea(evento, details);
//
//        comprobanteDeEgreso.setCedulaAQuienPaga((String) params.get("agenteExterno"));
//        comprobanteDeEgreso.setCedulaAQuienPaga((String) params.get("NombreAgenteExterno"));
//        comprobanteDeEgreso.setIdElaborador((String) params.get("agenteInterno"));
//        comprobanteDeEgreso.setIdAprovador((String) params.get("admin"));
//        comprobanteDeEgreso.setDebitos(Double.parseDouble(params.get("debitos").toString()));
//        comprobanteDeEgreso.setCreditos(Double.parseDouble(params.get("creditos").toString()));
//
//        meta.setId(eventoId.toString());
//
//        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
//        Date date = new Date(System.currentTimeMillis());
//        System.out.println(formatter.format(date));
//        meta.setFecha(date);
//
//        evento.setFecha((Timestamp) params.get(meta.getFecha()));
//
//        meta.setMonto(reaEntity.getAfectacion());
//        meta.setSumaEnLetras((String) params.get("sumaEnLetras"));
//        meta.setPorConceptoDe((String) params.get("porConceptoDe"));
//        meta.setPagadoA(evento.getAgenteExterno());
//
//        if(((String) params.get("tipoPago")).equals("consignacion")){
//            meta.setTipoPago(true);
//        }
//        //repo.save(meta);
        return "OK";

    }
}
