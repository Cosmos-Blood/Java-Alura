package Conceitos;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Checando suas informa��es... ");
		
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo! ");
		}  else {
			System.out.println("Infelizmente voc� n�o pode entrar. "); }
		
		}

}
