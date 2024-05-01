import java.util.Scanner;

public class Exercicio02_MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner  (System.in);

        double nota1, nota2;
        double media;

        System.out.print("Digite o valor da primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Dgiite o valor da segunda nota: ");
        sc.nextLine();
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) /2;

        System.out.println("Sua primeira nota foi: " + nota1);
        System.out.println("Sua segunda nota foi: " + nota2);
        System.out.println("Sua media foi de: "+ media);

        sc.close();
    }
}
