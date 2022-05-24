package co.edu.javeriana.seshat.sofiplus.Kernel;

import java.util.HashMap;

public interface ModuleRunnable {
    Object run(RequestMessage message) throws AuthorizationRequiredException;
}
