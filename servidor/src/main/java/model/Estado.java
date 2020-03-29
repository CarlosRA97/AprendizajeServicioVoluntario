package model;

/*
* Para gestionar las actividades, usamos los estados. Cada estado
* informa a los jestores de la situacion de la acitividad
* ENTRAMITE: Se encuentra en este estado cuando la actividad no a sido revisada por un administrador.
    ACEPTADA: Indica que la actividad esta lista para su pubicacion
    DENEGADA: La actividad no se puede llevar a vago por algun motibo
    MODIFICADA: La actividad a sido modificada y por ende no es aceptada
    OCULTA: La actividad a sido aceptada pero aun no se puede mostrar al publico
    PUBLICADA: La actividad a sido aceptada y ya es visible para los usuarios
    ABIERTA: Ya se pueden presentar los demandantes a esta actividad.
    CERRADA: La actividad esta cerrada a finalizado su ciclo de vida.
* */
public enum Estado {
    ENTRAMITE,
    ACEPTADA,
    DENEGADA,
    MODIFICADA,
    OCULTA,
    PUBLICADA,
    ABIERTA,
    CERRADA
}
