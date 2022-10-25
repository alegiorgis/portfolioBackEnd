# portfolioBackEnd
BackEnd porfolio Argentina Programa

-LOGIN user: ale@giorgis.com password:123456 (visible en la carpeta test, UserRespositoryTest). Este esta creado con JWT (java web token) como fue indicado en el curso.
URL base de datos https://github.com/alegiorgis/BaseDeDatosArgProgGiorgis
Contiene DER y script

El proyecto de trabajo integrador del curso Argentina programa. Esta armado en IntelliJ, no fue posible armar el proyecto en el IDE sugerido por el curso (NETBEANS) debido a que no me funcionaba.
Se utilizo SpringInitializr

La version de JAVA es 1.8

Contiene 7 models:
-Info: Contiene informacion del usuario: nombre apellido titulo about y foto.
-User: email y password de usuario, para la autenticacion.
-Educacion: titulo descripcion, fecha y foto
-Experiencia: titulo descripcion, fecha y foto. para fecha tenemos fecha de inicio y fecha de finalizacion de la experiencia. El cual no fue implementado en el front*
-Skills: englobalas soft y hard skills, nombre descripcion foto y porcentaje**
-Proyecto: nombre descripcion foto y link.
-Contacto: email github likedin e instagram***

*Debido a complicaciones del diseño de la tarjeta, se omitio la expresion de las fechas en el front. Queda anotado en el item MEJORAS.
**Se deberá crear un modelo distinto para distinguir las habilidades blandas de las duras debido a sus diferencias naturales.
***Este model se dejo de utilizar y se decidio hardcodear en el front.

Cada modelo tiene relacionado el Repositorio, Servicio, y controlador para lograr conectar con el front.

CORS: resuelto con @CrossOrigins en cada controlador con la url del front, o en su defecto localhost:4200 en caso de querer trabajar localmente.

Cualquiera sugerencia o critica constructivas son bienvenidas.

