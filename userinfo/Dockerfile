# Use the eclipse-temurin JRE image for Java 17
FROM eclipse-temurin:17-jre
WORKDIR /opt
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java ${JAVA_OPTS:--Xms512m -Xmx1024m} -jar app.jar