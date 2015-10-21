package br.univel.ExJms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.Topic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.univel.ExJms.entidade.Professor;
import br.univel.ExJms.entidade.Professor;

/**
 * Servlet implementation class ProfessorServletJMS
 */
@WebServlet("/ProfessorServletJMS")
public class ProfessorServletJMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(mappedName = "java:jboss/exported/jms/topic/professorTopic")
	private Topic topic;
 
	@Resource(mappedName = "java:/ConnectionFactory")
	private ConnectionFactory connectionFactory;

    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
    
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(getClass() + "Inicio........");
		Professor professor = new Professor();
		professor.setMatricula(2221L);
		professor.setNome("Maria da Silva");
		enviarObjetoForma1(professor);
		System.out.println(getClass() + "Fim........");
 
		PrintWriter out = response.getWriter();		
		out.print("<H1>Objeto PROFESSOR enviado com sucesso! JMS 1.0</H1>");	
	}

	public void enviarObjetoForma1(Professor professor) {
		try {
			Connection connection = connectionFactory.createConnection();
			try {
				Session session = connection.createSession(false,
						Session.AUTO_ACKNOWLEDGE);
				ObjectMessage objMessage = session.createObjectMessage();
		        objMessage.setObject(professor);
 
				MessageProducer messageProducer = session.createProducer(topic);
				messageProducer.send(objMessage);
				messageProducer.close();
			} finally {
				connection.close();
			}
		} catch (JMSException ex) {
			ex.printStackTrace();
		}
	}	
}
