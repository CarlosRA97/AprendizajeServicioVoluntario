package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@EqualsAndHashCode
@Getter @Setter
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Estado estado; // El valor estado deveria de tener unicamente los valores de (ENTRAMITE, ACEPTADO, DENEGADO)
    private Integer nota; // En el caso deque no esista una nota, este valor sera NULL
}
