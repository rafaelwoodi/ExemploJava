package com.teste;

import java.util.List;

import com.banco.UserDao;
import com.classes.User;

public class TestaLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDao dao = new UserDao();
		
		List<User> users = dao.getLista();
		
		for (User user : users) {
			  System.out.println("Código: " + user.getId_user());
			  System.out.println("Login: " + user.getLogin());
			  System.out.println("Senha: " + user.getSenha());
			  System.out.println("Nome Completo: " + user.getNome_completo());
			  System.out.println("Idade: " + 
					  user.getIdade()  + "\n");
			}
		
	}

}
