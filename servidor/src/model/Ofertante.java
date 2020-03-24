package model;

import java.util.List;

public class Ofertante extends Usuario {

    private String nif; // Identificacion mediante NIF
    private String direccion;
	private List<String> contacto;
	private String calificacion; //Mediante una puntuacion de estrellas

    // Getters y Setters
    //

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String> getContacto() {
        return contacto;
    }

    public void setContacto(List<String> contacto) {
        this.contacto = contacto;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
