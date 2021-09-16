package Conceitos;
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Checando sua idade... ");

		int idade = 10;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Você é maior de 18. ");
			System.out.println("Seja bem vindo! ");
		} else {
			if (quantidadePessoas >= 2) {
				{
					System.out.println("Você está acompanhado, pode entrar. ");
}
}
			else {System.out.println("Infelizmente você não possuí idade o suficiente para entrar. ");}
		}
	}
}