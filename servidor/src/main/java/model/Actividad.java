package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
    @OneToOne(cascade = CascadeType.ALL)
	@Getter @Setter private EstadoActividad estado;
	@Getter @Setter private String titulo;
	@Getter @Setter private String descripcion;
	@Getter @Setter private String imagen; // Base-64
    @Getter @Setter private Date fechaPublicada;
	@Getter @Setter private Date fechaAperturaPlazas;
	@Getter @Setter private Date fechaCierrePlazas;
	@Getter @Setter private Double horasInvertida;
	@Getter @Setter private Integer calificacion;
	@Getter @Setter private Integer numeroPlazas;
	@OneToMany
	@Getter @Setter private List<Evento> eventos;
	@OneToMany
    @Getter @Setter private List<Etiqueta> clasificacion;
	@OneToOne
    @Getter @Setter private Convalidacion convalidacion;

}
