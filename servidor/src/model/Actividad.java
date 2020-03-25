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
	private String descripcion;
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	@Temporal(TemporalType.DATE)
	private Date fechaFinal;
	private Double horasInvertida;
	private Integer calificacion;
	private Integer numeroPlazas;
	@OneToMany
	private List<Evento> eventos;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
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

    public Convalidacion getConvalidacion() {
        return convalidacion;
    }

    public void setConvalidacion(Convalidacion convalidacion) {
        this.convalidacion = convalidacion;
    }
}
