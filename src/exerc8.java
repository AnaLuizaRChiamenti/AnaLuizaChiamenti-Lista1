import java.util.Scanner;

public class exerc8 {
    //    8. (Lista1_08) Construa um programa em Java que leia (via teclado) as horas, minutos e
    //    segundos em determinado momento do dia, e que calcule e mostre qual o total de segundos
    //    decorridos neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours;
        int minutes;
        int seconds;

        System.out.print("Insira as horas: ");
        hours = scanner.nextInt();

        System.out.print("Insira os minutos: ");
        minutes = scanner.nextInt();

        System.out.print("Insira os segundos: ");
        seconds = scanner.nextInt();

        int allSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;
        System.out.println(allSeconds);


    }
}
