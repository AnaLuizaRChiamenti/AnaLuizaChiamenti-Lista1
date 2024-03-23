import java.util.Scanner;

public class exerc9 {
    //    9. (Lista1_09) Construa um programa em Java para ler (via teclado) 3 valores os quais
    //    correspondem ao número de convidados para um churrasco, sendo homens, mulheres e
    //    crianças. Sabendo que, em média, um homem come 650 gramas de carne, uma mulher come
    //420 gramas de carne, e uma criança come 290 gramas de carne, calcule a quantidade de carne
    //    necessária para o churrasco em quilogramas e mostre o resultado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mens;
        int womens;
        int kids;

        System.out.print("Quantos homens tem: ");
        mens = scanner.nextInt();

        System.out.print("Quantos mulheres tem: ");
        womens = scanner.nextInt();

        System.out.print("Quantos crianças tem: ");
        kids = scanner.nextInt();

        float allMensEats = mens * 650;
        float allWomensEats = womens * 420;
        float allKidsEats = kids * 290;

        float allMeat = (allMensEats + allWomensEats + allKidsEats) / 1000;

        System.out.printf("Precisará de %.2f kg de carne\n", allMeat);
    }
}
