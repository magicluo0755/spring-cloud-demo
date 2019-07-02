FROM java:8
VOLUME /tmp
ADD ./target/feign-consumer-service-0.0.1.jar /feign-consumer-service.jar
RUN bash -c 'touch /feign-consumer-service.jar'
EXPOSE 9876
ENTRYPOINT ["java","-jar","/feign-consumer-service.jar"]