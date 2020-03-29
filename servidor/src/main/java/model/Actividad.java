package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Actividad {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private EstadoActividad estado;
	private String titulo;
	private String descripcion;
	@Temporal(TemporalType.DATE)
    private  Date fechaPublicada;
    @Temporal(TemporalType.DATE)
	private Date fechaAperturaPlazas;
	@Temporal(TemporalType.DATE)
	private Date fechaCierrePlazas;
	private Double horasInvertida;
	private Integer calificacion;
	private Integer numeroPlazas;
	@OneToMany
	private List<Evento> eventos;
	@OneToMany
    private List<Etiqueta> clasificacion;
	@OneToOne
    private Convalidacion convalidacion;


    // Getters y Setters
    //

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEstado(EstadoActividad estado) {
        this.estado = estado;
    }

    public EstadoActividad getEstado() {
        return estado;
    }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Date getFechaPublicada() {
        return fechaPublicada;
    }

    public void setFechaPublicada(Date fechaPublicada) {
        this.fechaPublicada = fechaPublicada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaAperturaPlazas() {
        return fechaAperturaPlazas;
    }

    public void setFechaAperturaPlazas(Date fechaAperturaPlazas) {
        this.fechaAperturaPlazas = fechaAperturaPlazas;
    }

    public Date getFechaCierrePlazas() {
        return fechaCierrePlazas;
    }

    public void setFechaCierrePlazas(Date fechaCierrePlazas) {
        this.fechaCierrePlazas = fechaCierrePlazas;
    }

    public Double getHorasInvertida() {
        return horasInvertida;
    }

    public void setHorasInvertida(Double horasInvertida) {
        this.horasInvertida = horasInvertida;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(Integer numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Etiqueta> getClasificacion() { return clasificacion; }

    public void setClasificacion(List<Etiqueta> clasificacion) { this.clasificacion = clasificacion; }

    public Convalidacion getConvalidacion() {
        return convalidacion;
    }

    public void setConvalidacion(Convalidacion convalidacion) {
        this.convalidacion = convalidacion;
    }
}
