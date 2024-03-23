import java.util.Scanner;

public class exerc1 {

//    1. (Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
//    calcule o produto entre eles e mostre o resultado.

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Coloque o primeiro numero: ");
        number1 = scann.nextInt();

        System.out.print("Coloque o segundo numero: ");
        number2 = scann.nextInt();
        sum = number1 + number2;

        System.out.printf("Soma é %d\n", sum);
    }
}
