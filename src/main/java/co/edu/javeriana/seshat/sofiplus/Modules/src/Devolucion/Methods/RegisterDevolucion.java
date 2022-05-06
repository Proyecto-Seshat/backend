package co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities.DevolucionMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities.DevolucionMetadataRepository;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.Carrito;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Devolucion.Entities.Devolucion;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterDevolucion implements ModuleRunnable {


    @Autowired
    DevolucionMetadataRepository repo;
    @Override
    public Object run(HashMap<String, Object> params) {
        Carrito carrito = new Carrito((List<Map<String, Object>>) params.get("carrito"));
        Devolucion devolucion = new Devolucion((String) params.get("clienteCedula"), Double.parseDouble(params.get("total").toString()), carrito.getCarrito(), (String) params.get("nombreCliente"));
        FacturaMetadata meta = new FacturaMetadata();
        meta.setFechaVencimiento(new Date());
        meta.setTotal(devolucion.getTotal());
        meta.setCarrito(devolucion.getCarrito());


//probar si al fin sirve o no lo de la fecha actual
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        meta.setFecha(date);

        repo.save(meta);
        return "OK";

    }
}
