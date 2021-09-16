package Conceitos;
public class TestaCondicional02 {
	
	public static void main(String[] args) {
		System.out.println("Checando suas informações... ");
		
		int idade = 10;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo! ");
		}  else {
			System.out.println("Infelizmente você não pode entrar. "); }
		
		}
		
	}

