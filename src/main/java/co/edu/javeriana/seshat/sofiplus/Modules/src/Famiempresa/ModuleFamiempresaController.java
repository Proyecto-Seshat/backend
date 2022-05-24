package co.edu.javeriana.seshat.sofiplus.Modules.src.Famiempresa;

import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/famiempresas")
public class ModuleFamiempresaController {
    @PostMapping("/")
    String registerFamiempresa(@RequestBody HashMap<String, Object> body) throws AuthorizationRequiredException {
        return (String) Kernel.processRequest("module.famiempresa.registerFamiempresa", new RequestMessage(body)).run();
    }
}
