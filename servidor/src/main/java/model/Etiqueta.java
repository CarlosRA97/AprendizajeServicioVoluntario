package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * La clase etiqueta se utiliza para hacer match entre demandantes y las atividades
 **/
@Entity
@Getter @Setter
@EqualsAndHashCode
public class Etiqueta {
    @Id
    private String nombre;
}
