package co.edu.javeriana.seshat.sofiplus;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
import co.edu.javeriana.seshat.sofiplus.Modules.ModuleMethod;
import org.reflections.Reflections;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Objects;
import java.util.Set;

@SpringBootApplication
@EnableMongoRepositories
public class SofiplusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SofiplusApplication.class, args);
    }

    @Bean
    public CommandLineRunner getRunner(ApplicationContext ctx) {
        return (args) -> {
            Reflections reflections = new Reflections("co.edu.javeriana.seshat.sofiplus.Modules.src");
            Set<Class<? extends BusinessModule>> modules = reflections.getSubTypesOf(BusinessModule.class);
            modules.forEach(module -> {
                ctx.getBean(module).init();
            });
        };
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
}
