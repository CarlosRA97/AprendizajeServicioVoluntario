package model;

public class Convalidacion {

    private String descripcion; // Descripcion del metodo de evaluacion
    private String evaluacion; // Guia por la cual se rige la calificacion
    private Double calificacion; // Nota de 0 a 10
    private Double creditosMaximo;

    // Getters y Setters
    //
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Double getCreditosMaximo() {
        return creditosMaximo;
    }

    public void setCreditosMaximo(Double creditosMaximo) {
        this.creditosMaximo = creditosMaximo;
    }
}
