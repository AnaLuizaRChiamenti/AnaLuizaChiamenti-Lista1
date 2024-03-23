import java.util.Scanner;

public class exerc6 {
//    6. (Lista1_06) Construa um programa em Java para ler (via teclado) uma temperatura em
//    graus Fahrenheit, calcular e mostrar o valor correspondente em graus Celsius sabendo que
//    TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão
//    nos resultados (%.1f)).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque os graus em fahrenheit: ");
        float fahrenheit;
        fahrenheit = scanner.nextFloat();

        float tempoCelsius = 5 * (fahrenheit - 32) / 9;

        System.out.printf("Está %.1f graus celsius\n", tempoCelsius);
    }
}
