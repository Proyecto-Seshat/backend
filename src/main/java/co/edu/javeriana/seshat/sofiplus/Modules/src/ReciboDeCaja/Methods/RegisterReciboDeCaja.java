package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Methods;

import co.edu.javeriana.seshat.sofiplus.FrontEntities.ReciboCaja;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;

import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCajaMetadataRepository;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCaja;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCajaMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterReciboDeCaja implements ModuleRunnable {


    @Autowired
    ReciboDeCajaMetadataRepository repo;
    @Override
    public Object run(RequestMessage message) {
        ReciboCaja recibo = (ReciboCaja) message.getParams();
        //TODO: Implementar la logica de para ingresar a REA
        ReciboDeCajaMetadata meta = new ReciboDeCajaMetadata();
        meta.setId(recibo.getId());
        meta.setSuma(recibo.getSuma());
        meta.setSumaEnLetras(recibo.getSumaLetras());
        meta.setDescripcion(recibo.getDescripcion());
        meta.setDebito(recibo.getDebito());
        meta.setCredito(recibo.getCredito());
        repo.save(meta);
        return "OK";

    }
}
