package model;

/**
 * La clase demandante alma informacion relevante de los demandantes
 **/
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
    /** Son las etiquetas de los temas que al usuario le interesan */
    private List<Etiqueta> intereses;
    /** Los datos de interes, son datos que el demandante considera relevantes a la ora de preentarse a una actividad */
    private String datosDeInteres;
    @OneToMany
    /** Almacena las solicitudes del demandante */
    private List<Solicitud> solicitudes;

}