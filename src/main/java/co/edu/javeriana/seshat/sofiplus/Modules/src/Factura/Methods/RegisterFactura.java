package co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.Carrito;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.Factura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;
import co.edu.javeriana.seshat.sofiplus.Repositories.FacturaMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class RegisterFactura implements ModuleRunnable {

    @Autowired
    FacturaMetadataRepository repo;
    @Override
    public Object run(HashMap<String, Object> params) {
        Carrito carrito = new Carrito((List<Map<String, Object>>) params.get("carrito"));
        Factura factura = new Factura((String) params.get("clienteCedula"), Double.parseDouble(params.get("total").toString()), carrito.getCarrito());
        FacturaMetadata meta = new FacturaMetadata();
        meta.setFechaVencimiento(new Date());
        meta.setTotal(factura.getTotal());
        meta.setCarrito(factura.getCarrito());
        repo.save(meta);
        return "OK";

    }
}
