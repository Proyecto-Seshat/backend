package co.edu.javeriana.seshat.sofiplus.Modules.Factura;

import co.edu.javeriana.seshat.sofiplus.Kernel.Kernel;

public class ModuleFactura {
    public static void init(){
        Kernel.registerModuleRunnable("module.factura.getFactura", new getFactura());
    }
}
