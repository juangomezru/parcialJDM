# Para crear contenedor mysql con las conexiones de application properties
### docker run --name bdParcial -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=yms -e MYSQL_USER=user -e MYSQL_PASSWORD=clave -d -p 8085:3306 mysql

# Crear imagen del aplicativo con el dockerfile usar el siguiente comando:
### docker build --build-arg JAR_FILE=build/libs/parcial-arquitectura-0.0.1-SNAPSHOT.jar -t myorg/myapp .
