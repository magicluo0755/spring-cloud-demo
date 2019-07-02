FROM java:8
VOLUME /tmp
ADD ./target/config-client.jar /config-client.jar
RUN bash -c 'touch /config-client.jar'
EXPOSE 8903
ENTRYPOINT ["java","-jar","/config-client.jar"]