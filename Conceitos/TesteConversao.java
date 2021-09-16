package Conceitos;

public class TesteConversao {
	public static void main(String [] args) {
	
	//Ao colocar um n�mero real dentro do inteiro voc� perde um valor. Exemplo:
	
	double salario = 1250.90;
	int valor = (int) salario;
	// Para que o n�mero real fosse convertido a inteiro foi necess�rio usar os parenteses (int). 
	System.out.println(salario);
	System.out.println(valor);
	
	//Note que no console que o mesmo n�mero foi alterado.
	
	
	
//	long grandesNumeros = 9223372036854775807l;
	/* long: utilizado para comportar de -9223372036854775808 at� -9223372036854775807 n�meros. 
	 * Foi necess�rio acrescentar um L no final!*/

//	short poucosNumeros = 32767;
	/* short: utilizado para comportar de -32768 at� 32767 n�meros.*/
	
//	byte microNumeros = 127;
	/* byte: utilizado para comportar de -128 at� 127 n�meros.*/
	
	
	
	//A opera��o double n�o � o correto para c�lculos exatos. Exemplo: Calcular dinheiro.
	double valor1 = 0.2;
	double valor2 = 0.1;
	double total = valor1 + valor2;
	System.out.println(total);
	}

}
