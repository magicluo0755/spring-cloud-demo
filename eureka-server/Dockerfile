FROM java:8
VOLUME /tmp
ADD ./target/eureka-server.jar /eureka-server.jar
RUN bash -c 'touch /eureka-server.jar'
EXPOSE 9876
ENTRYPOINT ["java","-jar","/eureka-server.jar"]