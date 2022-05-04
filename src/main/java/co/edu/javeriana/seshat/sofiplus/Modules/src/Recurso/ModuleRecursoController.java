package co.edu.javeriana.seshat.sofiplus.Modules.src.Recurso;

import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/recurso")
public class ModuleRecursoController {
    @PostMapping("/")
    int registerFamiempresa(@RequestBody HashMap<String, Object> body) {
        return (int) Kernel.processRequest("module.recurso.registerRecurso", body).run();
    }
}
