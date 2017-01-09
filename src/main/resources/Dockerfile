FROM centos:latest
MAINTAINER jiaming
ADD docker-1.0-SNAPSHOT.jar /app/service/docker
RUN yum update -y
RUN yum install -y java-1.8.0-openjdk.x86_64
WORKDIR /app/service/docker
EXPOSE 8080
CMD ["java -jar *.jar"]