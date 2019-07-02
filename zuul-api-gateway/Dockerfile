FROM java:8
VOLUME /tmp
ADD ./target/zuul-api-gateway.jar /zuul-api-gateway.jar
RUN bash -c 'touch /zuul-api-gateway.jar'
EXPOSE 9000
ENTRYPOINT ["java","-jar","/zuul-api-gateway.jar"]