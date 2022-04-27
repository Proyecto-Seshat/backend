package co.edu.javeriana.seshat.sofiplus.Controllers;

import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {
    @PostMapping("/factura")
    public FacturaEntity getFactura(@RequestBody HashMap<String, Object> params){
        return (FacturaEntity) Kernel.processRequest("module.factura.getFactura", params).run();
    }
}
