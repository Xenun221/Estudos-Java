import java.util.Scanner;

public class Exercicio06EstruturaCondicional_Preco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha, quantidade;
        double total = 0;
        System.out.println("Escolha um lanche \n" +
                "1 Cachorro Quente R$4,00 \n" +
                "2 X-Salada R$4,50 \n" +
                "3 X-Bacon R$5,00 \n" +
                "4 Torrada Simples R$2,00 \n" +
                "5 Refrierante R$1.50" );
        escolha = sc.nextInt();

        System.out.println("Quantos vc vai querer: ");
        quantidade = sc.nextInt();

        if (escolha == 1)
            total = quantidade * 4.0;
        else if (escolha == 2) {
            total = quantidade * 4.50;
        } else if (escolha == 3) {
            total = quantidade * 5.00;
        } else if (escolha == 4) {
            total = quantidade * 2.00;
        } else if (escolha == 5) {
            total = quantidade * 1.50;
        }
        else{
            System.out.println("Informe uma das opções validas");
        }

        System.out.println("Valor total do pedido: " + total);

        sc.close();
    }
}
