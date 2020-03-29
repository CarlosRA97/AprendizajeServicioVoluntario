package model;

import jdk.jfr.Name;
import jdk.jfr.Percentage;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Table(name = "ESTADOACTIVIDAD")
public class  EstadoActividad {

    @Id
    //@Column(name = "id")
    private Long id;

    @OneToOne
    @MapsId
    private  Actividad activiadad;

    private Estado estado;
    private String mensaje;

    public EstadoActividad() {
    }

//    public EstadoActividad(Estado estado, String mensaje) {
//        this.estado = estado;
//        this.mensaje = mensaje;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Actividad getActiviadad() {
        return activiadad;
    }

    public void setActiviadad(Actividad activiadad) {
        this.activiadad = activiadad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
