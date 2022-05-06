package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Entities.EventoEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.ReaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;

import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.HashMap;

public class GetComprobanteDeEgreso implements ModuleRunnable {
    @Override
    public Object run(HashMap<String, Object> params) {

        return new EventoEntity((String) params.get("idComprobante"),(String) params.get("nitFamiempresa"), (Timestamp) params.get("fecha"), (String) params.get("tipoEvento"), (String) params.get("agenteInterno"), (String) params.get("agenteExterno"));


    }
}
