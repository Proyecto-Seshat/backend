package co.edu.javeriana.seshat.sofiplus.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsolidadoEntityPK implements Serializable {
    @Id
    private String idRecurso;
    @Id
    private String nitFamiempresa;
}
