package br.com.caicai.teste;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {

		// Instanciando a classe
		// É imperativo executar o comando abaixo para instanciar o objeto !!!
		
		Elevador objeto = new Elevador();
		objeto.inicializar("Torre A", 20, 10, 0);
		System.out.println(objeto.toString());
		
		// executar os testes para validar o objeto criado
		
		objeto.entrar();
		System.out.println(objeto.toString());
		objeto.entrar();
		objeto.subir(9);
		System.out.println(objeto.toString());
		objeto.sair();
		objeto.descer(5);
		System.out.println(objeto.toString());
		
		

	}

}
