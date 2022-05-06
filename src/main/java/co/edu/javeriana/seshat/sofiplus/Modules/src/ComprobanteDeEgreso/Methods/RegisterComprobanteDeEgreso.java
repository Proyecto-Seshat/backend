package co.edu.javeriana.seshat.sofiplus.Modules.src.ComprobanteDeEgreso.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCaja;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCajaMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Entities.ReciboDeCajaMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class RegisterComprobanteDeEgreso implements ModuleRunnable {


    @Autowired
    ReciboDeCajaMetadataRepository repo;
    @Override
    public Object run(HashMap<String, Object> params) {
        ReciboDeCaja reciboDeCaja = new ReciboDeCaja((String) params.get("cedulaDeQuienPaga"), (String) params.get("nombreDeQuienPaga"), Double.parseDouble(params.get("idRecibo").toString()), Double.parseDouble(params.get("debitos").toString()), Double.parseDouble(params.get("creditos").toString()) );
       ReciboDeCajaMetadata meta = new ReciboDeCajaMetadata();

        meta.setMonto(meta.getMonto());

//probar si al fin sirve o no lo de la fecha actual
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        meta.setFecha(date);

        //repo.save(meta);
        return "OK";

    }
}
