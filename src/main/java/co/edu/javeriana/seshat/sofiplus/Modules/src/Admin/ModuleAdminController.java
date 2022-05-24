package co.edu.javeriana.seshat.sofiplus.Modules.src.Admin;

import co.edu.javeriana.seshat.sofiplus.Entities.UsuarioEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Admin.FrontEntities.Famiempresa;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Admin.FrontEntities.Usuario;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Inventario.FrontEntities.Servicio;
import co.edu.javeriana.seshat.sofiplus.Security.JWTToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class ModuleAdminController {
    @PostMapping("/famiempresa")
    public Famiempresa crearItem(@RequestBody Famiempresa famiempresa) throws AuthorizationRequiredException {
        return (Famiempresa) Kernel.processRequest("admin/famiempresa/post", new RequestMessage(famiempresa)).run();
    }

    @PostMapping("/usuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario) throws AuthorizationRequiredException {
        return (Usuario) Kernel.processRequest("admin/usuario/post", new RequestMessage(usuario)).run();
    }
}
