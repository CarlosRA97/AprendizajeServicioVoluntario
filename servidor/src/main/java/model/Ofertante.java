package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode
public class Ofertante extends Usuario {

    private String nif; // Identificacion mediante NIF
    private String direccion;
	@ElementCollection
    private List<String> contacto;
	private String calificacion; //Mediante una puntuacion de estrellas

}
