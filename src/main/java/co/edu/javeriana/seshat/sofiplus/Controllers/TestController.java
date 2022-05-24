package co.edu.javeriana.seshat.sofiplus.Controllers;

import co.edu.javeriana.seshat.sofiplus.Entities.RecursoEntity;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Tercero.FrontEntities.Cliente;
import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
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


    @PostMapping("/test")
    public RecursoEntity test(@RequestBody RecursoEntity recurso) {
        return this.recursoRepository.save(recurso);
    }

    @PostMapping("/registrarCliente")
    public String registrarCliente(@RequestBody HashMap<String, Object> cliente) throws AuthorizationRequiredException {
        return (String) Kernel.processRequest("module.terceros.registerCliente", new RequestMessage(cliente)).run();
    }

    @GetMapping("/getCliente")
    public Cliente getCliente(@RequestParam String cedula) throws AuthorizationRequiredException {
        HashMap<String, Object> params = new HashMap<>();
        params.put("cedula", cedula);
        return (Cliente) Kernel.processRequest("module.teceros.getCliente", new RequestMessage(params)).run();
    }

    @GetMapping("/trollCliente")
    public Cliente trollCliente(@RequestParam String cedula) throws AuthorizationRequiredException {
        HashMap<String, Object> params = new HashMap<>();
        params.put("cedula", cedula);
        return (Cliente) Kernel.processRequest("module.troll.trollAgent", new RequestMessage(params)).run();
    }

    @PostMapping("/postFactura")
    public String postFactura(@RequestBody HashMap<String, Object> body) throws AuthorizationRequiredException {
        return (String) Kernel.processRequest("module.factura.registerFactura", new RequestMessage(body)).run();
    }

    @PostMapping("/testFactura")
    public String testFactura(@RequestBody HashMap<String, Object> body) throws AuthorizationRequiredException {
        return (String) Kernel.processRequest("module.factura.testFactura", new RequestMessage(body)).run();
    }
}
