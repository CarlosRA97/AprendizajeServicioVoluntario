package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Etiqueta {
    @Id
    @Getter @Setter private String nombre;
}
