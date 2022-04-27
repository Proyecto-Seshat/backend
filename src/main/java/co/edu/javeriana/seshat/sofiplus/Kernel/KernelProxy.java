package co.edu.javeriana.seshat.sofiplus.Kernel;

import java.util.HashMap;

public class KernelProxy {
    ModuleRunnable method;
    HashMap<String, Object> params;

    public KernelProxy(ModuleRunnable method, HashMap<String, Object> params) {
        this.method = method;
        this.params = params;
    }

    public Object run(){
        return this.method.run(this.params);
    }
}
