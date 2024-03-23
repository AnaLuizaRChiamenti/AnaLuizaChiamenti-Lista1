import java.util.Scanner;

public class exerc3 {
//    3. (Lista1_03) Construa um programa em Java para ler (via teclado) quatro números do tipo
//    inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
//    de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
//    com duas casas decimais depois da vírgula (%.2f).
    
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        int number1;
        int number2;
        int number3;
        int number4;
        
        float sum;

        System.out.print("Coloque o primeiro número: ");
        number1 = scann.nextInt();

        System.out.print("Coloque o segundo número: ");
        number2 = scann.nextInt();

        System.out.print("Coloque o terceiro número: ");
        number3 = scann.nextInt();

        System.out.print("Coloque o quarto número: ");
        number4 = scann.nextInt();

        sum = (number1 + number2 + number3 + number4) / 4;

        System.out.printf("A media é %.2f", sum);
    }
}
