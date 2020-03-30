package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
/**
 * La clase solicitud es la relacion entre el demandante y actividad para jentionar las participaciones
 * */
@Entity
@EqualsAndHashCode
@Getter @Setter
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    /** Los valores validos para estados devereian de ser:
     *  ENTRAMITE, ACEPTADO, DENEGADO */
    private Estado estado;
    /** Si la actividad no es evaluable o no tiene nota este valor devera de estar a NULL */
    private Integer nota; // En el caso deque no esista una nota, este valor sera NULL
}
