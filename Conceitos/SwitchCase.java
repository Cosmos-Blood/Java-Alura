package Conceitos;
public class SwitchCase {

    public static void main(String[] args) {

        // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
        // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

        double salario = 3300.0;
        int mes = 10;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7%");
            System.out.println("Você pode deduzir até R$ 142");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");
        }
        switch (mes) {
        case 1: System.out.println("Mês de Janeiro.");
        break;
        case 2: System.out.println("Mês de Fevereiro.");
        break;
        case 3: System.out.println("Mês de Março.");
        break;
        case 4: System.out.println("Mês de Abril.");
        break;
        case 5: System.out.println("Mês de Maio.");
        break;
        case 6: System.out.println("Mês de Junho.");
        break;
        case 7: System.out.println("Mês de Julho.");
        break;
        case 8: System.out.println("Mês de Agosto.");
        break;
        case 9: System.out.println("Mês de Setembro.");
        break;
        case 10: System.out.println("Mês de Outubro.");
        break;
        case 11: System.out.println("Mês de Novembro.");
        break;
        case 12: System.out.println("Mês de Dezembro.");
        break;
        
        default: System.out.println("O mês digitado não é válido");
        
        }
    }
}