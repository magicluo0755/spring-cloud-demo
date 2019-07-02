FROM java:8
VOLUME /tmp
ADD ./target/ribbon-consumer-service.jar /ribbon-consumer-service.jar
RUN bash -c 'touch /ribbon-consumer-service.jar'
EXPOSE 9901
ENTRYPOINT ["java","-jar","/ribbon-consumer-service.jar"]