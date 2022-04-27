package co.edu.javeriana.seshat.sofiplus;

import co.edu.javeriana.seshat.sofiplus.Modules.Factura.ModuleFactura;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SofiplusApplication {
    public static void main(String[] args) {
        ModuleFactura.init();
        SpringApplication.run(SofiplusApplication.class, args);
    }
}
