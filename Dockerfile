FROM tomcat:8.0.51-jre8-alpine
#ENV CATALINA_HOME=/usr/local/tomcat
#RUN rm -rf /usr/local/tomcat/webapps/*

#COPY ./target/*.war $CATALINA_HOME/webapps/


#COPY ./target/jwt-auth-service.war /usr/local/tomcat/webapps/ROOTe.war

CMD ["catalina.sh","run"]