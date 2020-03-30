package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;


/**
 * La clase demandante almacena informacion relevante de los demandantes
 **/
@Entity
@Getter @Setter
@EqualsAndHashCode
public class Demandante extends Usuario {

    private Integer edad;

    /**
     * Son las etiquetas de los temas que al usuario le interesan
     * */
    @OneToMany
    private List<Etiqueta> intereses;

    /**
     * Los datos de interes, son datos que el demandante considera relevantes a la hora de presentarse a una actividad
     * */
    private String datosDeInteres;


    /**
     * Almacena las solicitudes del demandante
     * */
    @OneToMany
    private List<Solicitud> solicitudes;

}