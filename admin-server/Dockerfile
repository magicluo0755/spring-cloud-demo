FROM java:8
VOLUME /tmp
ADD ./target/admin-server.jar /admin-server.jar
RUN bash -c 'touch /admin-server.jar'
EXPOSE 9800
ENTRYPOINT ["java","-jar","/admin-server.jar"]