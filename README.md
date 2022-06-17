# Video explicando la ejecución y el código
https://youtu.be/Wb68nMC3SXo

# Reto-Listas-Tareas
Este repositorio tiene como finalidad presentar el Reto Técnico Full Stack, el cual consiste en hacer una lista de listas, usando Spring Boot como Backend, MySQL como Base de Datos y JavaScript Vanilla como FrontEnd.

# Backend
En este repositorio se presentará la parte del Backend, la cual fue desarrollada en el lenguaje de programación Java y el framework Spring Boot.

# Base de Datos 
Es necesario contar con una base de datos en MySQL llamada tareas, las tablas en la base de datos se crearán automáticamente cuando se ejecute el proyecto Spring-Boot. Para lograr esto es necesario configurar el archivo application.properties que se encuentra en la carpeta llamada resources, como se explica a continuación:

spring.datasource.url=jdbc:mysql://localhost:3306/tareas --> (Reemplazar con la dirección del servidor de bases de datos que se tenga, este reemplazo se hace en la parte donde dice "localhost:3306")

spring.datasource.username=root --> (Reemplazar si es el caso colocando un usuario de base de datos con suficientes permisos, sino dejar root tal como se encuentra)

spring.datasource.password=basesdedatos --> (Reemplazar con la contraseña del usuario de bases de datos que haya colocado)

spring.jpa.hibernate.ddl-auto=update --> (Dejar este campo tal y como se encuentra)

# Diagrama Entidad-Relación
A continuación se presenta el Diagrama Entidad Relación que se tiene para la base de datos:

![image](https://user-images.githubusercontent.com/97564825/174196671-ac34ea45-23a9-4f84-bc38-34ad201ba0e4.png)
