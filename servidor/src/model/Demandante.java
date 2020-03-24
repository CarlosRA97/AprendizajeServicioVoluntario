package model;

import java.util.List;

public class Demandante extends Usuario {

    private Integer edad;
    private String ramaDeConocimiento;
    private List<String> datosDeInteres;
    private List<Actividad> actividadesRealizadas;
    private List<Actividad> actividadesCandidatas;

    // Getters y Setters
    //
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRamaDeConocimiento() {
        return ramaDeConocimiento;
    }

    public void setRamaDeConocimiento(String ramaDeConocimiento) {
        this.ramaDeConocimiento = ramaDeConocimiento;
    }

    public List<String> getDatosDeInteres() {
        return datosDeInteres;
    }

    public void setDatosDeInteres(List<String> datosDeInteres) {
        this.datosDeInteres = datosDeInteres;
    }

    public List<Actividad> getActividadesRealizadas() {
        return actividadesRealizadas;
    }

    public void setActividadesRealizadas(List<Actividad> actividadesRealizadas) {
        this.actividadesRealizadas = actividadesRealizadas;
    }

    public List<Actividad> getActividadesCandidatas() {
        return actividadesCandidatas;
    }

    public void setActividadesCandidatas(List<Actividad> actividadesCandidatas) {
        this.actividadesCandidatas = actividadesCandidatas;
    }
}