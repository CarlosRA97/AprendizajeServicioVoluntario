package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Almacena los dato para llevar a cabo la conbalidacion
 * no es obligatorio si no se quiere evaluar la asignatura
 **/

@Entity
@Getter @Setter
@EqualsAndHashCode
public class Convalidacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /** Descripcion del metodo de evaluacion */
    private String descripcion;
    /** Guia por la cual se rige la calificacion */
    private String evaluacion;
    /** Numero de maximo de creditos */
    private Double creditosMaximo;

}
