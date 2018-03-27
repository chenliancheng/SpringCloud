FROM lwieske/java-8
VOLUME /tmp
ADD person-1.0-SNAPSHOT.jar person.jar
EXPOSE 8002
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","person.jar"]
