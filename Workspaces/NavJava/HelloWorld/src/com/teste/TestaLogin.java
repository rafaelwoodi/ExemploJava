package com.teste;


import com.banco.UserDao;
import com.classes.User;

public class TestaLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		// pronto para gravar
		 User user = new User();
		 user.setLogin("");
		 user.setSenha("");
		 
		 // grave nessa conexão!!!
		 UserDao dao = new UserDao();
		 
		 String retorno = "";
		 
		 retorno = dao.login(user);
		 
		 if (retorno.equals(""))
			 System.out.println("Erro");
		 else
			 System.out.println("Conectado");
		 
		}
		catch(Exception e) {
            throw new RuntimeException(e);
	}
	}
}
