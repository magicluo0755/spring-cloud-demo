FROM java:8
VOLUME /tmp
ADD ./target/config-server.jar /config-server.jar
RUN bash -c 'touch /config-server.jar'
EXPOSE 9890
ENTRYPOINT ["java","-jar","/config-server.jar"]