package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


/**
 * La clase eventos se utiliza para gestionar los calendarios de las actividades
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
    private String titulo;
	private String descripcion;

}
