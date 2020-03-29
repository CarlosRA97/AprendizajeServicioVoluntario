package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Convalidacion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String descripcion; // Descripcion del metodo de evaluacion
    @Getter @Setter private String evaluacion; // Guia por la cual se rige la calificacion
    @Getter @Setter private Double calificacion; // Nota de 0 a 10
    @Getter @Setter private Double creditosMaximo; //Numero de maximo de creditos

}
