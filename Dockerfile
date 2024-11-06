FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/dockerizing-springboot.jar dockerizing-springboot.jar
ENTRYPOINT [ "java","-jar","dockerizing-springboot.jar" ] 

