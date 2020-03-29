package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String nombre;
	@Getter @Setter private String apellidos;
	@Getter @Setter private String contrasena;
	@Getter @Setter private String email;
	@Getter @Setter private String telefono;
	@OneToMany
    @Getter @Setter private List<Actividad> actividades;

}
