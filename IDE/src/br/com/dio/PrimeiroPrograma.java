package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Gato", "preto", 10);
		Livros livros = new Livros();
		
		System.out.println(gato);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World " + (a + b));*/

	}

}

class Livros{
	private String nome;
	private String npag;
}
