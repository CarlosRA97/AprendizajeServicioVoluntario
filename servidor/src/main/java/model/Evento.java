package model;

import javax.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Getter @Setter private Long id;
    @Temporal(TemporalType.DATE)
    @Getter @Setter private Date fecha;
	@Getter @Setter private String descripcion;

}
