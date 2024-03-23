import java.util.Scanner;

public class exerc5 {
//    5. (Lista1_05) Construa um programa em Java para ler (via teclado) o raio de um círculo,
//    calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)).
//    Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).


    public static void main(String[] args) {
    Scanner scann = new Scanner(System.in);

    System.out.print("Coloque raio do circulo: ");
    float circleRadius;
    circleRadius = scann.nextFloat();

    double pi = 3.141592;

    double sum = (pi * (circleRadius * circleRadius));
    System.out.printf("A área do circulo é %.2f", sum);
    }
}
