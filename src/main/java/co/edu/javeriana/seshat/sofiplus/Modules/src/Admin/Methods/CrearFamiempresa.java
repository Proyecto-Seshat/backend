package co.edu.javeriana.seshat.sofiplus.Modules.src.Admin.Methods;

import co.edu.javeriana.seshat.sofiplus.Entities.FamiempresaEntity;
import co.edu.javeriana.seshat.sofiplus.Kernel.AuthorizationRequiredException;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Admin.FrontEntities.Famiempresa;
import co.edu.javeriana.seshat.sofiplus.Repositories.FamiempresaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CrearFamiempresa implements ModuleRunnable {

    @Autowired
    private FamiempresaEntityRepository famiempresaEntityRepository;

    @Override
    public Object run(RequestMessage message) throws AuthorizationRequiredException {
        Famiempresa famiempresa = (Famiempresa) message.getParams();
        return famiempresaEntityRepository.save(new FamiempresaEntity(famiempresa)).getFrontEntity();
    }
}
