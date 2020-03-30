package model;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class EstadoActividad {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    private String mensaje;

    public EstadoActividad(Estado estado) {
        this.estado = estado;
    }

    public EstadoActividad(Estado estado, String mensaje) {
        this(estado);
        this.mensaje = mensaje;
    }

}
