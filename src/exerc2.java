import java.util.Scanner;

public class exerc2 {

//    2. (Lista1_02) Construa um programa em Java que leia (via teclado) três números do tipo
//    inteiro, calcule e mostre o resultado da soma deles.

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;

        System.out.print("Coloque o primeiro número: ");
        number1 = scann.nextInt();

        System.out.print("Coloque o segundo número: ");
        number2 = scann.nextInt();

        System.out.print("Coloque o terceiro número: ");
        number3 = scann.nextInt();

        sum = number1 + number2 + number3;

        System.out.printf("Soma é %d\n", sum);
    }
}
