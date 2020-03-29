package model;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
public class EstadoActividad {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Getter @Setter private Long id;
    @Getter @Setter private Estado estado;
    @Getter @Setter private String mensaje;

    public EstadoActividad(Estado estado) {
        this.estado = estado;
    }

    public EstadoActividad(Estado estado, String mensaje) {
        this(estado);
        this.mensaje = mensaje;
    }

}
