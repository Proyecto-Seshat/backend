package co.edu.javeriana.seshat.sofiplus;

import co.edu.javeriana.seshat.sofiplus.Modules.BusinessModule;
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

@SpringBootApplication
@EnableMongoRepositories
public class SofiplusApplication {
    public static void main(String[] args) {
        SpringApplication.run(SofiplusApplication.class, args);
    }

    @Bean
    public CommandLineRunner getRunner(ApplicationContext ctx) {
        return (args) -> {
            try {
                File f = new File("./src/main/java/co/edu/javeriana/seshat/sofiplus/Modules/src");
                for (File module : Objects.requireNonNull(f.listFiles())) {
                    URL[] cp = {module.toURI().toURL()};
                    try (URLClassLoader urlcl = new URLClassLoader(cp)) {
                        Class<? extends BusinessModule> moduleClass = (Class<? extends BusinessModule>) urlcl.loadClass("co.edu.javeriana.seshat.sofiplus.Modules.src." + module.getName() + ".Module" + module.getName());
                        ctx.getBean(moduleClass).init();
                    }
                }
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
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
