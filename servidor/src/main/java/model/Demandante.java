package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Getter @Setter
@EqualsAndHashCode
public class Demandante extends Usuario {

    private Integer edad;
    @OneToMany
    private List<Etiqueta> intereses;
    private String datosDeInteres;
    @OneToMany
    private List<Solicitud> solicitudes;

}