package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ofertante extends Usuario {

    @Getter @Setter private String nif; // Identificacion mediante NIF
    @Getter @Setter private String direccion;
	@ElementCollection
    @Getter @Setter private List<String> contacto;
	@Getter @Setter private String calificacion; //Mediante una puntuacion de estrellas

}
