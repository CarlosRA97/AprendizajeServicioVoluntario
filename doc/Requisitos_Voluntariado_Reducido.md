<h1 id="requisitos.-grupo-a">Requisitos. Grupo A</h1>
<h2 id="descripción-del-proyecto.">Descripción del proyecto.</h2>
<p>La petición del cliente es el desarrollo de un foro interactivo para la participación en voluntariados, los cuales complementan los conocimientos teóricos de los participantes en relación a alguna asignatura o carrera.</p>
<p>Un posible acercamiento a la idea del cliente sería una plataforma parecida a Job Today, en la que se ofrezcan los voluntarios y los usuarios puedan optar y evaluar estas ofertas.̵</p>
<h2 id="elementos.">Elementos.</h2>
<ul>
<li>Actividades.
<ul>
<li>Voluntariados.
<ul>
<li>Evaluables</li>
<li>No evaluables</li>
</ul>
</li>
<li>Eventos(Consultar con el cliente)
<ul>
<li>Evaluables</li>
<li>No evaluables</li>
</ul>
</li>
</ul>
</li>
<li>Usuarios.
<ul>
<li>Demandantes.
<ul>
<li>Alumnos</li>
<li>PID</li>
<li>PAS</li>
</ul>
</li>
<li>Administradores.
<ul>
<li>Administradores WEB.</li>
<li>Administradores de actividades.
<ul>
<li>PID</li>
<li>PAS</li>
</ul>
</li>
</ul>
</li>
<li>Ofertantes.</li>
</ul>
</li>
</ul>
<h2 id="requisitos-funcionales.">Requisitos funcionales.</h2>
<ol>
<li>
<p>Registrarse como solicitante.</p>
</li>
<li>
<p>Registrarse como ofertante.</p>
</li>
<li>
<p>Crear una actividad.</p>
</li>
<li>
<p>Modificar una actividad.</p>
</li>
<li>
<p>Evaluar la viabilidad una actividad.</p>
</li>
<li>
<p>Gestionar una actividad.</p>
</li>
<li>
<p>Modificar el estado de una actividad.</p>
<pre><code> Se cuenta con todos los datos de de la actividad.

 Los distintos estados se muestran más adelante en el documento
</code></pre>
</li>
<li>
<p>Evaluar la calidad de una actividad.</p>
<pre><code> Evaluación personal del solicitante hacia la actividad mediante puntuación sesgada.
</code></pre>
</li>
<li>
<p>Comentar en una actividad.</p>
</li>
<li>
<p>Solicitar la participación a una actividad.</p>
</li>
<li>
<p>Retirar la participación de una actividad.</p>
</li>
<li>
<p>Gestiona la participación de un solicitante en una actividad.</p>
<ol>
<li>
<p>Evaluación del participante(en caso de que sea necesario).</p>
<pre><code> Informes, ejercicios, ...
</code></pre>
</li>
<li>
<p>Aceptación del participante.</p>
</li>
<li>
<p>Expulsión del participante.</p>
</li>
</ol>
</li>
<li>
<p>Modificar preferencias del demandante.</p>
<pre><code>Datos que los demandantes consideran relevantes para gestionar las recomendaciones de actividades o a la hora de evaluar sus solicitudes.
</code></pre>
</li>
</ol>
<p><img src="https://raw.githubusercontent.com/CarlosRA97/AprendizajeServicioVoluntario/master/uml/casos_de_uso.png" alt="casos de uso"></p>
<p>Casos de Uso</p>
<h2 id="usuarios.">Usuarios.</h2>
<p>Cada categoría de usuario dispondrá de una vista específica que cumpla con sus requisitos.</p>
<p>Los usuarios se dividen en:</p>
<h3 id="demandantes">Demandantes:</h3>
<p>Son los usuarios que reclaman la participación de una actividad. Estos son pertenecientes a la UMA y deben de acreditarse como:</p>
<ol>
<li>Alumnos: Alumnos que están cursando una en la UMA y desean hacer una actividad</li>
<li>PAS: Personal de administración y servicios.</li>
<li>PID: Personal investigador y docente.</li>
</ol>
<p>Esta diferencia es necesaria porque los PAS y PDI además de solicitar actividades podrán gestionarlas y serán los encargados de evaluar a los demandantes de actividades evaluables.</p>
<h3 id="administradores">Administradores:</h3>
<p>En esta categoría se agrupan a los administradores técnicos o web y a los administradores de actividad (PAS y PDI).</p>
<p>Siendo estos últimos los encargados de validar y  gestionar las actividades.</p>
<h3 id="ofertantes">Ofertantes:</h3>
<p>ONGs, empresas, ayuntamientos, …, Entidades que ofrecen la actividades.</p>
<h2 id="datos-de-los-usuarios">Datos de los usuarios:</h2>
<ol>
<li>Nombre.</li>
<li>Contraseña.</li>
<li>Correo electrónico.</li>
<li>Numero de telefono.</li>
</ol>
<h3 id="datos-específicos-de-los-usuarios.">Datos específicos de los usuarios.</h3>
<ol>
<li>Apellidos.</li>
<li>Edad.</li>
<li>Rama de conocimiento: Carrera cursada o conocimientos obtenidos.</li>
<li>Datos de interés .
<ol>
<li>Asignaturas superadas(De cada carrera).</li>
<li>Ramas de conocimiento en la que están interesados</li>
<li>Conocimientos que desean poner en práctica</li>
<li>Información sobre las actividades anteriores.</li>
</ol>
</li>
</ol>
<h3 id="datos-específicos-de-los-ofertantantes.">Datos específicos de los Ofertantantes.</h3>
<ol>
<li>Identificador.(Dato que valida la existencia y la veracidad de la entidad)</li>
<li>Localización de la empresa.</li>
<li>Otros métodos de contacto.</li>
<li>Valoración derivada de las actividades</li>
</ol>
<h2 id="actividades.">Actividades.</h2>
<p>Se refiere a las ofertas presentadas a los usuarios.</p>
<p>Estas actividades podrán ser evaluadas por pos los usuarios demandantes en relación con la calidad de la actividad.</p>
<p>Las actividades se pueden convalidadas por créditos de la universidad y la evaluación a nivel académico de la actividad será llevada por un administrador de actividades.</p>
<h3 id="datos-de-la-actividad.">Datos de la actividad.</h3>
<ol>
<li>Descripción: Texto que describe la actividad que se desarrolla.</li>
<li>Horarios: Horarios en los que se desarrolla la actividad.
<ol>
<li>Fecha de inicio.</li>
<li>Fecha de finalización.</li>
<li>Horas de desarrollo.</li>
<li>Calendario de la actividad.</li>
</ol>
</li>
<li>Puntuación de la actividad: Puntuacion de los usuarios.</li>
<li>Datos de convalidación:
<ol>
<li>Método de convalidación.</li>
<li>Metodos de evaluacion.</li>
<li>Requisitos de convalidación.</li>
</ol>
</li>
<li>Requisitos de participación.</li>
<li>Número de plazas.</li>
</ol>
<p><strong><span>Datos de interés y relacionados.</span></strong></p>
<ol start="7">
<li>Nombre del oferente.</li>
<li>Correo de contacto(Puede ser el ofrecido por la empresa u otro)</li>
<li>Nombre del administrador de la actividad.</li>
<li>Convocatorias anteriores.</li>
<li>Estado de la actividad.
<ol>
<li>En trámite.</li>
<li>Aceptada.</li>
<li>Denegada.</li>
<li>Modificada.</li>
<li>Oculta.</li>
<li>Publicada.</li>
<li>Abierta.</li>
<li>Cerrada.</li>
</ol>
</li>
<li>Fecha de apertura de las plazas o de publicación.</li>
<li>fecha de ocultamiento.</li>
</ol>

