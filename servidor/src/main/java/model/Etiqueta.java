package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Etiqueta {
    @Id
    private String nombre;
}
