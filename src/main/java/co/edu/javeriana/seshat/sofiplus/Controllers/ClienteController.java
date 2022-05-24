package co.edu.javeriana.seshat.sofiplus.Controllers;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.UsuarioEntity;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Tercero.FrontEntities.Cliente;
import co.edu.javeriana.seshat.sofiplus.Security.JWTToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    DataBroker broker;

    @PostMapping
    public String crearCliente(@RequestBody Cliente cliente){
        JWTToken token = (JWTToken)SecurityContextHolder.getContext().getAuthentication().getDetails();
        System.out.println(token);
        return "OK";
    }

    @GetMapping
    public UsuarioEntity buscarCliente(@RequestParam String id){
        Optional<UsuarioEntity> cliente = broker.requerirUsuario(id);
        if(cliente.isEmpty()){
            throw new RuntimeException("Usuario no encontrado");
        }
        return cliente.get();
    }


}
