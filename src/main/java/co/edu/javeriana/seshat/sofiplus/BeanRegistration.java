package co.edu.javeriana.seshat.sofiplus;

import co.edu.javeriana.seshat.sofiplus.Kernel.ModuleRunnable;
import co.edu.javeriana.seshat.sofiplus.Modules.ModuleMethod;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.data.util.AnnotatedTypeScanner;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BeanRegistration implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(
            BeanDefinitionRegistry bdr) throws BeansException {
        Reflections reflections = new Reflections("co.edu.javeriana.seshat.sofiplus.Modules.src");
        Set<Class<?>> methods = reflections.getTypesAnnotatedWith(ModuleMethod.class);
        methods.forEach(method -> {
            bdr.registerBeanDefinition(method.getCanonicalName(), BeanDefinitionBuilder.genericBeanDefinition(method).setScope("prototype").getBeanDefinition());
        });
    }

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory clbf) throws BeansException {
    }
}
