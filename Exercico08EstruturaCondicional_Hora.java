import java.util.Scanner;

public class Exercico08EstruturaCondicional_Hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;

        System.out.println("Digite a hora inicial: ");
        inicio = sc.nextInt();

        System.out.println("Digite a hora final: ");
        fim = sc.nextInt();

        if (inicio < fim){
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - fim;
        }
        System.out.println("O jogo durou: " + duracao + " horas");
    }
}
