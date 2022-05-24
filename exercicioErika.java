import java.util.Scanner;

public class exercicioErika {
    /*Elabore um algoritmo em Java que represente uma calculadora com as operações (+, - , / e *). 
    Apresente os casos de teste para testar a calculadora.

    Escolha um dos exercícios feitos na aula prática. Apresente os 
    casos de teste para testar o código.*/

    /*OBS: prof, o seguinte código valida as 2 condições da atividade, escolhi o exercício 1 da lista 12*/
    /*Ele atende tanto a calculadora dessa atividade quanto o exercício feito na aula prática*/

    public int num1, num2, indice;
    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    private int soma(){
        return num1 + num2;
    }

    private int subtracao(){
        return num1 - num2;
    }

    private int multiplicacao(){
        return num1 * num2;
    }

    private int divisao(){
        if (num2 == 0) {
            throw new ArithmeticException("O valor 1 não pode ser maior que o valor 2");
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        exercicioErika exE1 = new exercicioErika();

        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("Entre com o numero 1, 2 e o indice respectivamente:");
        exE1.setNum1(input.nextInt());
        exE1.setNum2(input.nextInt());
        exE1.setIndice(input.nextInt());

        switch (exE1.getIndice()) {
            case 1:
                System.out.println(exE1.soma());
                break;
            case 2:
                System.out.println(exE1.subtracao());
            break;
            case 3:
                System.out.println(exE1.multiplicacao());
            break;
            case 4:
                System.out.println(exE1.divisao());
            break;
            default:
                break;
        }
    }

}
