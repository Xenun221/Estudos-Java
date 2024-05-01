import java.util.Scanner;

public class Exercicio03_ConversoDeMedidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double medida, conversor;

        System.out.println("Digite a medida em Metro: ");
        medida = sc.nextDouble();

        conversor = medida * 100;

        System.out.println("A conversão de "+ medida + " Metros e de "+ conversor);
    }
}
