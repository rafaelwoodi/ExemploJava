package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExemploServlet extends HttpServlet 
{
	/*public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String nome = request.getParameter("nomeUrl");
		PrintWriter out = response.getWriter();
		out.println("O meu nome é: " + nome);
		out.close();
	}

}*/
public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException, Exception 
{
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	String matricula = request.getParameter("matricula");
	String nome = request.getParameter("nome");
	String idade = request.getParameter("idade");
	String msg = "<br>O aluno " + nome + " de matricula " + matricula + " com " + idade + " anos de idade.<br>";
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Servlet SvCadastro</title>");
	out.println("</head>");
	out.println("<body><center>");
	out.println("<h1>Informação do cadastro</h1><br><br><hr>");
	out.println(msg);
	out.println("Foi cadastrado com sucesso, no sistema!!!!<br><hr><br>");
	out.println("<a href='index.jsp'>Voltar</a>");
	out.println("</center></body>");
	out.println("</html>");
	out.close();
}
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {        
        handleRequest(request, response);
        
    } catch (ServletException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
     request.setCharacterEncoding("UTF-8"); 
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8");  
        handleRequest(request, response);

    } catch (ServletException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
}



