import java.util.Scanner;

public class exerc7 {
    //    7. (Lista1_07) Construa um programa em Java que leia (via teclado) um comprimento em
    //    polegadas, calcule e mostre o comprimento correspondente em milímetros, considerando
    //    que 1 polegada equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão
    //    nos resultados (%.1f)).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque as polegadas: ");
        float inches;
        inches = scanner.nextFloat();

        float mm = 25.4F;

        float sum = inches * mm;

        System.out.printf("Esta tela tem %.1f milimetros\n", sum);
    }
}
