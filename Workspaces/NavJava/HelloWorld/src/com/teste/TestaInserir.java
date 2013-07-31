package com.teste;

import com.banco.UserDao;
import com.classes.User;

public class TestaInserir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pronto para gravar
		 User user = new User();
		 user.setId_user(2);
		 user.setLogin("teste");
		 user.setSenha("teste");
		 user.setNome_completo("Teste");
		 user.setIdade(20);
		 
		 // grave nessa conexão!!!
		 UserDao dao = new UserDao();
		 
		 // método elegante
		 dao.adiciona(user);
		 
		 System.out.println("Gravado!");	
		
	}

}
