# tads3a4bim
ExercÃ­cios de fixaÃ§Ã£o


ExJMS

Tutorial Base: http://www.feltex.com.br/felix/exemplo-completo-jsf-primefaces-ejb-hibernate-mysql-jms/

- A configuração das filas, que pede no tutorial para executar pelo arquivo XML, foi feita diretamente no console de administração do wildfly 9; indo em Configurations > Subsystems > Messaging > default > Destinations e adicionados com as configurações que iriam no XML (name e jndi), desmarcando a opção Durable? e com o Selector vazio. Adicionados alunoQueue e professorTopic.

- Para configurar o projeto para trabalhar com EJB e JMS, ir no menu do JForge e selecionar o Setup EJB e Setup JMS.

- Como o JForge só consegue configurar o JMS na versão 1.1, a parte do tutorial que faz a implementação com JMS 2.0, não foi feita neste projeto.

- Foi necessário alterar no código o nome do caminho JNDI que ficou diferente, utilizado diretamente o que foi configurado no wildfly, "java:jboss/exported/jms/queue/alunoQueue", na annotation @Resource do objeto Queue fila.


Tutorial Base: http://www.feltex.com.br/felix/exemplo-completo-com-jsf-primefaces-ejb-hibernate-mysql-jms-topic/

- O tutorial utiliza o servlet com a vers'ao JMS 2.0, mas como o Forge utiliza a 1.1, foi pego como base o exemplo anterior, da implementação do servlet para o aluno na versão 1.1 e reformulada para trabalhar com Topic e com a classe Professor.


ExCDI

Tutorial Base: https://netbeans.org/kb/docs/javaee/cdi-inject_pt_BR.html

Foi criado o arquivo Process.xhtml do tutorial dentro da pasta src > main > webapp;
Também foi preciso criar um arquivo web.xml, dentro da pasta src > main > webapp > WEB-INF com o seguinte conteúdo:

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
	id="WebApp_ID" version="3.0">
	<display-name>tutorialWeb</display-name>
	<welcome-file-list>
		<welcome-file>Process.xhtml</welcome-file>
	</welcome-file-list> <!-- JSF -->
	<servlet>
		<servlet-name>Faces Servlet</servlet-name>
		<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>*.xhtml</url-pattern>
	</servlet-mapping>
</web-app>

Para poder fazer o passo do tutorial que pedia que fosse alterada a página inicial do projeto, foi preciso criar este arquivo, e também fazer o Setup do projeto para CDI.


ExJSF/Primefaces

Tutorial Base: https://computacaoanotada.wordpress.com/2011/07/15/aplicacao-ejb-3-1-jsf2-primefaces-3-0-maven-parte-1/

Foi criado um projeto maven do tipo War somente, sem alterar o pom.xml;

A parte 2 do tutorial fala sobre implementar um DAO, foi utilizado um EntityManager injetado para fazer a parte do DAO de buscar a lista de produtos;

O projeto teve seu setup feito para JSF;



 
