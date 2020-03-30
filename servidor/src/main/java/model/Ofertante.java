package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.List;


/**
 * La clase Ofertante almacena la informacion extra del ofertante
 **/
@Entity
@Getter @Setter
@EqualsAndHashCode
public class Ofertante extends Usuario {

    /**
     * Identificacion mediante numero de identificacion fiscal
     * */
    private String nif;

    /**
     * Direccion fisica de la empresa o organizacion
     * */
    private String direccion;

    /**
     * Mas metodos de contactos o contactos extra
     * Ej: Contactos de trabajadores relacionados
     * */
    @ElementCollection
    private List<String> contacto;

    /**
     * Calificacion de calidad
     * */
	private Double calificacion;

}
