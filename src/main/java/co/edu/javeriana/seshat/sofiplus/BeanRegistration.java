package co.edu.javeriana.seshat.sofiplus;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Factura.GetFactura;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros.Methods.GetCliente;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Terceros.Methods.RegisterCliente;
import co.edu.javeriana.seshat.sofiplus.Modules.src.Troll.Methods.TrollAgent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.Objects;

@Component
public class BeanRegistration implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(
            BeanDefinitionRegistry bdr) throws BeansException {
//        bdr.registerBeanDefinition(GetFactura.class.getCanonicalName(), BeanDefinitionBuilder.genericBeanDefinition(GetFactura.class).setScope("prototype").getBeanDefinition());
//        bdr.registerBeanDefinition(RegisterCliente.class.getCanonicalName(), BeanDefinitionBuilder.genericBeanDefinition(RegisterCliente.class).setScope("prototype").getBeanDefinition());
//        bdr.registerBeanDefinition(GetCliente.class.getCanonicalName(), BeanDefinitionBuilder.genericBeanDefinition(GetCliente.class).setScope("prototype").getBeanDefinition());
//        bdr.registerBeanDefinition(TrollAgent.class.getCanonicalName(), BeanDefinitionBuilder.genericBeanDefinition(TrollAgent.class).setScope("prototype").getBeanDefinition());
        try {
            File f = new File("./src/main/java/co/edu/javeriana/seshat/sofiplus/Modules/src");
            for (File module : Objects.requireNonNull(f.listFiles())) {
                File fMethod = new File(module.getAbsolutePath() + "/Methods/");
                for (File method :
                        Objects.requireNonNull(fMethod.listFiles())) {
                    URL[] cp = {method.toURI().toURL()};
                    try (URLClassLoader urlcl = new URLClassLoader(cp)) {
                        String methodName = method.getName().substring(0, method.getName().lastIndexOf('.'));
                        Class<? extends ModuleRunnable> methodClass = (Class<? extends ModuleRunnable>) urlcl.loadClass("co.edu.javeriana.seshat.sofiplus.Modules.src." + module.getName() + ".Methods." + methodName);
                        bdr.registerBeanDefinition(methodClass.getCanonicalName(), BeanDefinitionBuilder.genericBeanDefinition(methodClass).setScope("prototype").getBeanDefinition());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        } catch (MalformedURLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory clbf) throws BeansException {
    }
}
