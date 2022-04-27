package co.edu.javeriana.seshat.sofiplus.Kernel;

import java.util.HashMap;

public class Kernel {
    private static final HashMap<String, ModuleRunnable> index = new HashMap<>();

    public static void registerModuleRunnable(String uri, ModuleRunnable method) {
        index.put(uri, method);
    }

    public static KernelProxy processRequest(String uri, HashMap<String, Object> params) {
        return new KernelProxy(index.get(uri), params);
    }
}
