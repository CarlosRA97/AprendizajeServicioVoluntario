package model;

import javax.persistence.*;
import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
/**
 * La clase eventos se utiliza para gestuiona los calendarios de las actividades
 * */
@Entity
@Getter @Setter
@EqualsAndHashCode
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
	private String descripcion;

}
