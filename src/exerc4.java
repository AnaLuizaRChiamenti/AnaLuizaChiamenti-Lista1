import java.util.Scanner;

public class exerc4 {
//    4. (Lista1_04) Construa um programa em Java que leia um número do tipo “inteiro” (via
//    teclado) e o guarde em uma variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadrado
//    de X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produto
//    de X pela metade de X.

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int number1;
        System.out.print("Coloque o primeiro número: ");
        number1 = scann.nextInt();

        System.out.println(number1);

        float square = number1 * number1;
        System.out.println(square);

        float rest = number1 % 3;
        System.out.println(rest);

        float half = number1 / 2;
        System.out.println(half);

        float product = (number1 * number1) / number1;
        System.out.println(product);
    }
}
