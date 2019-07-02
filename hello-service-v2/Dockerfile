FROM java:8
VOLUME /tmp
ADD ./target/hello-service-v2.jar /hello-service-v2.jar
RUN bash -c 'touch /hello-service-v2.jar'
EXPOSE 8901
ENTRYPOINT ["java","-jar","/hello-service-v2.jar"]