package Conceitos;

public class TesteConversao {
	public static void main(String [] args) {
	
	//Ao colocar um número real dentro do inteiro você perde um valor. Exemplo:
	
	double salario = 1250.90;
	int valor = (int) salario;
	// Para que o número real fosse convertido a inteiro foi necessário usar os parenteses (int). 
	System.out.println(salario);
	System.out.println(valor);
	
	//Note que no console que o mesmo número foi alterado.
	
	
	
//	long grandesNumeros = 9223372036854775807l;
	/* long: utilizado para comportar de -9223372036854775808 até -9223372036854775807 números. 
	 * Foi necessário acrescentar um L no final!*/

//	short poucosNumeros = 32767;
	/* short: utilizado para comportar de -32768 até 32767 números.*/
	
//	byte microNumeros = 127;
	/* byte: utilizado para comportar de -128 até 127 números.*/
	
	
	
	//A operação double não é o correto para cálculos exatos. Exemplo: Calcular dinheiro.
	double valor1 = 0.2;
	double valor2 = 0.1;
	double total = valor1 + valor2;
	System.out.println(total);
	}

}
