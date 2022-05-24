package co.edu.javeriana.seshat.sofiplus.DataFacade;

import co.edu.javeriana.seshat.sofiplus.Entities.ConsolidadoEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@NoArgsConstructor
public class ConsolidadoBuilderFactory {
    @Autowired
    private DataBroker broker;

    public ConsolidadoBuilder getBuilder(String nitFamiempresa) {
        return new ConsolidadoBuilder(nitFamiempresa, this.broker);
    }
}
