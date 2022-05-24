package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;

public class GetComprobanteDeEgreso implements ModuleRunnable {
    @Override
    public Object run(RequestMessage params) {
//        return new EventoEntity((String) params.get("idComprobante"),(String) params.get("nitFamiempresa"), (Timestamp) params.get("fecha"), (String) params.get("tipoEvento"), (String) params.get("agenteInterno"), (String) params.get("agenteExterno"));
        return "OK";
    }
}
