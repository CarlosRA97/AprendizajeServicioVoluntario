package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
/**
 * La clase Ofertante almacena la informacion extra del demandante
 **/
@Entity
@Getter @Setter
@EqualsAndHashCode
public class Ofertante extends Usuario {
    /** Identificacion mediante numero de identificacion fiscal */
    private String nif;
    /** Direccion fisica */
    private String direccion;
	@ElementCollection
    /**
     * Mas metodos de contactos o contactos exta
     * Ej: Contactos de trabajadores relacionados */
    private List<String> contacto;
    /** Calificacion de calidad */
	private Double calificacion;

}
