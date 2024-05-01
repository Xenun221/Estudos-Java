import java.util.Scanner;

public class Exercicio04_AreaQuadrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double AreaQuadrado, dobro;



        System.out.print("Digite a area do quadrado: ");
        AreaQuadrado = sc.nextDouble();

        dobro  = Math.pow(AreaQuadrado, 2);

        System.out.println("A área do quadrado é "+ AreaQuadrado);
        System.out.println("O dobro dessa área é " + dobro);

        sc.close();




    }
}
