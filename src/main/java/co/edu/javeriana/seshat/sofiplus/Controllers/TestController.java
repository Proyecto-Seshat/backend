package co.edu.javeriana.seshat.sofiplus.Controllers;

import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.RecursoEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Repositories.RecursoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {
    @Autowired
    private RecursoEntityRepository recursoRepository;

    @PostMapping("/factura")
    public FacturaEntity getFactura(@RequestBody HashMap<String, Object> params) {
        return (FacturaEntity) Kernel.processRequest("module.factura.getFactura", params).run();
    }

    @PostMapping("/test")
    public RecursoEntity test(@RequestBody RecursoEntity recurso) {
        return this.recursoRepository.save(recurso);
    }
}
