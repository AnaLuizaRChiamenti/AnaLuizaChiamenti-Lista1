import java.util.Scanner;

public class exerc3_1 {
//    3.1. (Lista1_03_1) A mesma especificação do exercício anterior (Lista1_03) só que
//    agora usando números do tipo float (com duas casas decimas depois da vírgula (%.2f)).

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        float number1;
        float number2;
        float number3;
        float number4;

        float sum;

        System.out.print("Coloque o primeiro número: ");
        number1 = scann.nextFloat();

        System.out.print("Coloque o segundo número: ");
        number2 = scann.nextFloat();

        System.out.print("Coloque o terceiro número: ");
        number3 = scann.nextFloat();

        System.out.print("Coloque o quarto número: ");
        number4 = scann.nextFloat();

        sum = (number1 + number2 + number3 + number4) / 4;

        System.out.printf("A media é %.2f", sum);
    }
}
