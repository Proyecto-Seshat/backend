package co.edu.javeriana.seshat.sofiplus.Controllers;

import co.edu.javeriana.seshat.sofiplus.Entities.FacturaEntity;
import co.edu.javeriana.seshat.sofiplus.Entities.RecursoEntity;
import co.edu.javeriana.seshat.sofiplus.FrontEntities.Cliente;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Repositories.PersonaEntityRepository;
import co.edu.javeriana.seshat.sofiplus.Repositories.RecursoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class TestController {
    @Autowired
    private RecursoEntityRepository recursoRepository;

    @Autowired
    private PersonaEntityRepository personaRepo;

    @PostMapping("/factura")
    public FacturaEntity getFactura(@RequestBody HashMap<String, Object> params) {
        return (FacturaEntity) Kernel.processRequest("module.factura.getFactura", params).run();
    }

    @PostMapping("/test")
    public RecursoEntity test(@RequestBody RecursoEntity recurso) {
        return this.recursoRepository.save(recurso);
    }

    @PostMapping("/registrarCliente")
    public String registrarCliente(@RequestBody HashMap<String, Object> cliente) {
        return (String) Kernel.processRequest("module.terceros.registerCliente", cliente).run();
    }

    @GetMapping("/getCliente")
    public Cliente getCliente(@RequestParam String cedula){
        HashMap<String, Object> params = new HashMap<>();
        params.put("cedula", cedula);
        return (Cliente) Kernel.processRequest("module.teceros.getCliente", params).run();
    }

    @GetMapping("/trollCliente")
    public Cliente trollCliente(@RequestParam String cedula){
        HashMap<String, Object> params = new HashMap<>();
        params.put("cedula", cedula);
        return (Cliente) Kernel.processRequest("module.troll.trollAgent", params).run();
    }
}
