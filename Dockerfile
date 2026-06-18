# Usamos a imagem oficial do Tomcat 10 com Java 21
FROM tomcat:10.1-jdk21
# Remove os apps padrões do Tomcat para evitar conflitos
RUN rm -rf /usr/local/tomcat/webapps/*
# Copia o arquivo .war gerado pelo Maven para dentro do Tomcat do container
# O nome do arquivo dentro do container será 'webapp.war' conforme o exemplo do enunciado (http://localhost:8181/webapp)
COPY target/*.war /usr/local/tomcat/webapps/webapp.war
# Expõe a porta padrão do Tomcat
EXPOSE 8080

# Inicia o Tomcat
CMD ["catalina.sh", "run"]