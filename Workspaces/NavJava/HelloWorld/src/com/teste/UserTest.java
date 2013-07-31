package com.teste;

import junit.framework.TestCase;

import com.classes.User;

public class UserTest extends TestCase {
	
	public void testMaioridade(){
		int Idade = 18;
		int IdadeEsperada = 18;
		
		int IdadeRetorno = User.Maioridade(Idade);
		
		assertEquals(IdadeEsperada, IdadeRetorno);
	}
	
	public void testNome(){
		String Nome = "Ghiso";
		String NomeEsperado = "Ghiso";
		
		String NomeRetorno = User.NomeCompleto(Nome);
		
		assertEquals(NomeEsperado, NomeRetorno);
	}

}
