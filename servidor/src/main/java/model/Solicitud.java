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

    /**
     * Los valores validos para estados deberian de ser:
     * ENTRAMITE, ACEPTADA, DENEGADA
     * */
    @OneToOne(cascade = CascadeType.ALL)
    private Estado estado;

    /**
     * Si la actividad no es evaluable o no tiene nota este valor debera de estar a NULL
     * */
    private Integer nota;
}
