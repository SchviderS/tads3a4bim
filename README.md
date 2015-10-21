# tads3a4bim
Exercícios de fixação


ExJMS

Tutorial Base: http://www.feltex.com.br/felix/exemplo-completo-jsf-primefaces-ejb-hibernate-mysql-jms/

- A configura��o das filas, que pede no tutorial para executar pelo arquivo XML, foi feita diretamente no console de administra��o do wildfly 9; indo em Configurations > Subsystems > Messaging > default > Destinations e adicionados com as configura��es que iriam no XML (name e jndi), desmarcando a op��o Durable? e com o Selector vazio. Adicionados alunoQueue e professorTopic.

- Para configurar o projeto para trabalhar com EJB e JMS, ir no menu do JForge e selecionar o Setup EJB e Setup JMS.

- Como o JForge s� consegue configurar o JMS na vers�o 1.1, a parte do tutorial que faz a implementa��o com JMS 2.0, n�o foi feita neste projeto.

- Foi necess�rio alterar no c�digo o nome do caminho JNDI que ficou diferente, utilizado diretamente o que foi configurado no wildfly, "java:jboss/exported/jms/queue/alunoQueue", na annotation @Resource do objeto Queue fila.


Tutorial Base: http://www.feltex.com.br/felix/exemplo-completo-com-jsf-primefaces-ejb-hibernate-mysql-jms-topic/

- O tutorial utiliza o servlet com a vers'ao JMS 2.0, mas como o Forge utiliza a 1.1, foi pego como base o exemplo anterior, da implementa��o do servlet para o aluno na vers�o 1.1 e reformulada para trabalhar com Topic e com a classe Professor.