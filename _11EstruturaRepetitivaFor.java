import java.util.Scanner;

public class _11EstruturaRepetitivaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Digite quantas vezes quer repitir: ");
        N = sc.nextInt();
        int soma = 0;
        //Estrutura FOR
        for (int i = 0; i < N; i++){
          int x;
          System.out.println("Digite um numero: ");
          x = sc.nextInt();
          soma += x;

        }

        System.out.println(soma);







        sc.close();
    }
}
