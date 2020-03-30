package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter
@EqualsAndHashCode
abstract class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
	private String apellidos;
	private String contrasena;
	private String email;
	private String telefono;
	@OneToMany
    private List<Actividad> actividades;

}
