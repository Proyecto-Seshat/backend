package co.edu.javeriana.seshat.sofiplus.Modules.src.ReciboDeCaja.Methods;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.Entities.FacturaMetadata;

import java.util.HashMap;

public class AnularReciboDeCaja implements ModuleRunnable {
    @Override
    public Object run(HashMap<String, Object> params) {
        FacturaMetadata factura = new FacturaMetadata();
       // factura= FacturaMetadataRepository.findById((String) params.get("id"); llamar la factura e igualarla a la instancia
        //factura.estado = true; aca se pone en true  el atributo estado
        //return new FacturaEntity((String) params.get("clienteCedula"), (int) params.get("total")); retornar la factura instanciada con atributo cambiado
        //factura.save(factura); aca se guarda en la BD
        return 0;
    }
}
