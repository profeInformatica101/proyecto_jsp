# Usa la imagen de Tomcat con JDK 11
FROM tomcat:9-jdk11-openjdk

# Copia el archivo WAR al directorio de aplicaciones de Tomcat
COPY ./target/proyecto_jsp.war /usr/local/tomcat/webapps/

# Expone el puerto 8080
EXPOSE 8080
