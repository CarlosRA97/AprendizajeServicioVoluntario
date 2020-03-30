package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
@EqualsAndHashCode
public class Convalidacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;     // Descripcion del metodo de evaluacion
    private String evaluacion;      // Guia por la cual se rige la calificacion
    private Double calificacion;    // Nota de 0 a 10
    private Double creditosMaximo;  //Numero de maximo de creditos

}
