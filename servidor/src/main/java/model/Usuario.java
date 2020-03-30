package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


/**
 * La clase usuario es la madre de las clases Demandante, Ofertante y Administrador
 * */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter
@EqualsAndHashCode
abstract class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del usuario o el nombre de la empresa
     * */
    private String nombre;

    /**
     * Si el usuario es un ofertante este campo se define a null
     * */
	private String apellidos;

	/**
     * Se usara el cifrado SHA-256
     * */
	private String contrasena;
	private String email;
	private String telefono;

    /**
     * En cada usuario almacenara informacion de las actividades relacionada
     * En caso del demandante no tiene utilidad definida
     * */
    @OneToMany
    private List<Actividad> actividades;

}
