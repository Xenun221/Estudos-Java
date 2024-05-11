import java.util.Scanner;

public class Exercicio013EstruturaFOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int x;
        System.out.println("Digite um numero: ");
        x = sc.nextInt();



        for(int i=1; i<=10; i++){
            int multi = i * x;
            System.out.println(i + " X " + x + " = " + multi);
        }





        sc.close();
    }
}

