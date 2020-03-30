package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
@Getter @Setter
@EqualsAndHashCode
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @OneToOne(cascade = CascadeType.ALL)
	private Estado estado;
    private String titulo;
    private String descripcion;
    private String imagen; // Base-64

	@OneToMany
	private List<Comentario> comentarios;

	/**
	 * Fecha en la que se debe de hacer visible la actividad
	 * */
	private Date fechaPublicacion;
	private Date fechaAperturaPlazas;
	private Date fechaCierrePlazas;

	private Double horasInvertida;

	/**
	 * Suma de la cantidad de estrellas que los demandantes le asignan a la actividad
	 * */
	private Integer calificacion;
	private Integer numeroPlazas;
	@OneToMany
	private List<Evento> eventos;
	@OneToMany
    private List<Etiqueta> clasificacion;
	@OneToOne(cascade = CascadeType.ALL)
    private Convalidacion convalidacion;
	@OneToMany
	private List<Solicitud> solicitudes;

}
