package Conceitos;
public class SwitchCase {

    public static void main(String[] args) {

        // De 1900.0 at� 2800.0 o IR � de 7.5% e pode deduzir R$ 142
        // De 2800.01 at� 3751.0 o IR � de 15% e pode deduzir R$ 350
        // De 3751.01 at� 4664.00 o IR � de 22.5% e pode deduzir R$ 636

        double salario = 3300.0;
        int mes = 10;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota � de 7%");
            System.out.println("Voc� pode deduzir at� R$ 142");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir at� R$ 350");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota � de 22.5%");
            System.out.println("Voc� pode deduzir at� R$ 636");
        }
        switch (mes) {
        case 1: System.out.println("M�s de Janeiro.");
        break;
        case 2: System.out.println("M�s de Fevereiro.");
        break;
        case 3: System.out.println("M�s de Mar�o.");
        break;
        case 4: System.out.println("M�s de Abril.");
        break;
        case 5: System.out.println("M�s de Maio.");
        break;
        case 6: System.out.println("M�s de Junho.");
        break;
        case 7: System.out.println("M�s de Julho.");
        break;
        case 8: System.out.println("M�s de Agosto.");
        break;
        case 9: System.out.println("M�s de Setembro.");
        break;
        case 10: System.out.println("M�s de Outubro.");
        break;
        case 11: System.out.println("M�s de Novembro.");
        break;
        case 12: System.out.println("M�s de Dezembro.");
        break;
        
        default: System.out.println("O m�s digitado n�o � v�lido");
        
        }
    }
}