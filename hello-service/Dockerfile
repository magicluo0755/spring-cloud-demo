FROM java:8
VOLUME /tmp
ADD ./target/hello-service.jar /hello-service.jar
RUN bash -c 'touch /hello-service.jar'
EXPOSE 8901
ENTRYPOINT ["java","-jar","/hello-service.jar"]