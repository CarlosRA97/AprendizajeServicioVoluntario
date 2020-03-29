package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Demandante extends Usuario {

    @Getter @Setter private Integer edad;
    @Getter @Setter private String ramaDeConocimiento;
    @ElementCollection
    @Getter @Setter private List<String> datosDeInteres;
    @OneToMany
    @Getter @Setter private List<Actividad> actividadesRealizadas;
    @OneToMany
    @Getter @Setter private List<Actividad> actividadesCandidatas;
    @OneToMany
    @Getter @Setter private List<Convalidacion> convalidacions;

}