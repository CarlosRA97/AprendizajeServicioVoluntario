package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EstadoType estadoType;
    private String mensaje;

    public Estado(EstadoType estadoType) {
        this.estadoType = estadoType;
    }

    public Estado(EstadoType estadoType, String mensaje) {
        this(estadoType);
        this.mensaje = mensaje;
    }

}
