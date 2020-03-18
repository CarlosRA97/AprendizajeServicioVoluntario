# Requisitos. Grupo A

## Descripción del proyecto

La petición del cliente es el desarrollo de un foro interactivo para la participación en voluntariados, los cuales complementan los conocimientos teóricos de los participantes en relación a alguna asignatura o carrera.

Un posible acercamiento a la idea del cliente sería una plataforma parecida a Job Today, en la que se ofrezcan los voluntarios y los usuarios puedan optar y evaluar estas ofertas.

## Elementos

*   Actividades.
    *   Voluntariados.
        *   Evaluables
        *   No evaluables
    *   Eventos(Consultar con el cliente)
        *   Evaluables
        *   No evaluables
*   Usuarios.
    *   Demandantes.
        *   Alumnos
        *   PID
        *   PAS
    *   Administradores.
        *   Administradores WEB.
        *   Administradores de actividades.
            *   PID
            *   PAS
    *   Ofertantes.

## Requisitos funcionales

1. Registrarse como solicitante.
2. Registrarse como ofertante.
3. Crear una actividad.
4. Modificar una actividad.
5. Evaluar la viabilidad una actividad.
6. Gestionar una actividad.
7. Modificar el estado de una actividad.
	> Se cuenta con todos los datos de de la actividad.
	
	> Los distintos estados se muestran más adelante en el documento

9. Evaluar la calidad de una actividad.
	> Evaluación personal del solicitante hacia la actividad mediante puntuación sesgada.

10. Comentar en una actividad.
11. Solicitar la participación a una actividad.
12. Retirar la participación de una actividad.
13. Gestiona la participación de un solicitante en una actividad.
    1. Evaluación del participante(en caso de que sea necesario).
	    > Informes, ejercicios, ...
	    
    2. Aceptación del participante.
    3. Expulsión del participante.
14. Modificar preferencias del demandante.
	> Datos que los demandantes consideran relevantes para gestionar las recomendaciones de actividades o a la hora de evaluar sus solicitudes.

![casos de uso](https://raw.githubusercontent.com/CarlosRA97/AprendizajeServicioVoluntario/master/uml/casos_de_uso.png)

Casos de Uso

## Usuarios

Cada categoría de usuario dispondrá de una vista específica que cumpla con sus requisitos.

Los usuarios se dividen en:

### Demandantes:

Son los usuarios que reclaman la participación de una actividad. Estos son pertenecientes a la UMA y deben de acreditarse como:

1. Alumnos: Alumnos que están cursando una en la UMA y desean hacer una actividad
2. PAS: Personal de administración y servicios.
3. PID: Personal investigador y docente.

Esta diferencia es necesaria porque los PAS y PDI además de solicitar actividades podrán gestionarlas y serán los encargados de evaluar a los demandantes de actividades evaluables.

### Administradores:

En esta categoría se agrupan a los administradores técnicos o web y a los administradores de actividad (PAS y PDI). 

Siendo estos últimos los encargados de validar y  gestionar las actividades.

### Ofertantes:

ONGs, empresas, ayuntamientos, …, Entidades que ofrecen la actividades.

## Datos de los usuarios:

1. Nombre.
2. Contraseña.
3. Correo electrónico.
4. Numero de telefono.

### Datos específicos de los Demandantes

1. Apellidos.
2. Edad.
3. Rama de conocimiento: Carrera cursada o conocimientos obtenidos.
4. Datos de interés .
    1. Asignaturas superadas(De cada carrera).
    2. Ramas de conocimiento en la que están interesados
    3. Conocimientos que desean poner en práctica
    4. Información sobre las actividades anteriores.

### Datos específicos de los Ofertantes

1. Identificador.(Dato que valida la existencia y la veracidad de la entidad)
2. Localización de la empresa.
3. Otros métodos de contacto.
4. Valoración derivada de las actividades

## Actividades

Se refiere a las ofertas presentadas a los usuarios.

Estas actividades podrán ser evaluadas por pos los usuarios demandantes en relación con la calidad de la actividad.

Las actividades se pueden convalidadas por créditos de la universidad y la evaluación a nivel académico de la actividad será llevada por un administrador de actividades.

### Datos de la actividad

1. Descripción: Texto que describe la actividad que se desarrolla.
2. Horarios: Horarios en los que se desarrolla la actividad.
    1. Fecha de inicio.
    2. Fecha de finalización.
    3. Horas de desarrollo.
    4. Calendario de la actividad.
3. Puntuación de la actividad: Puntuacion de los usuarios.
4. Datos de convalidación:
    1. Método de convalidación.
    2. Metodos de evaluacion.
    3. Requisitos de convalidación.
5. Requisitos de participación.
6. Número de plazas.

**<span style="text-decoration:underline;">Datos de interés y relacionados.</span>**

7. Nombre del oferente.
8. Correo de contacto(Puede ser el ofrecido por la empresa u otro)
9. Nombre del administrador de la actividad.
10. Convocatorias anteriores.
11. Estado de la actividad.
    1. En trámite.
    2. Aceptada.
    3. Denegada.
    4. Modificada.
    5. Oculta.
    6. Publicada.
    7. Abierta.
    8. Cerrada.
12. Fecha de apertura de las plazas o de publicación.
13. fecha de ocultamiento.

