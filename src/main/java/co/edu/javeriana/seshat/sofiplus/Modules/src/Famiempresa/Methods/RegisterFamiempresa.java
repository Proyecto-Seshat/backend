package co.edu.javeriana.seshat.sofiplus.Modules.src.Famiempresa.Methods;

import co.edu.javeriana.seshat.sofiplus.DataFacade.DataBroker;
import co.edu.javeriana.seshat.sofiplus.Entities.FamiempresaEntity;
import co.edu.javeriana.seshat.sofiplus.FrontEntities.FamiEmpresa;
import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Kernel.RequestMessage;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterFamiempresa implements ModuleRunnable {

    @Autowired
    private DataBroker broker;

    @Override
    public Object run(RequestMessage message) {
        FamiEmpresa famiEmpresa = (FamiEmpresa) message.getParams();
        FamiempresaEntity nuevaFamiEmpresa = new FamiempresaEntity();
        nuevaFamiEmpresa.setNit(famiEmpresa.getNit());
        nuevaFamiEmpresa.setRazonSocial(famiEmpresa.getRazonSocial());
        return broker.registrarFamiempresa(nuevaFamiEmpresa);
    }
}
