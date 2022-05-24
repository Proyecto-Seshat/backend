package co.edu.javeriana.seshat.sofiplus.Kernel;

import co.edu.javeriana.seshat.sofiplus.Security.JWTToken;
import org.springframework.stereotype.Component;

import java.util.HashMap;

public class KernelProxy {
    ModuleRunnable method;
    RequestMessage message;

    public KernelProxy(ModuleRunnable method, RequestMessage message) {
        this.method = method;
        this.message = message;
    }

    public Object run() throws AuthorizationRequiredException {
        return this.method.run(this.message);
    }
}
