import java.util.Scanner;

public class Exercicio09EstruturaSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
 Escreva um programa que leia o código de um determinado produto e
mostre a sua classificação. Utilize a tabela abaixo como referência:
Código Descrição
1 Alimento não-perecível
2 Alimento perecível
3 Vestuário
4 Limpeza
         */

        int cod;
        System.out.println("Digite o que vc quer e a categoria vai ser mostrada \n " +
                "1-Arroz \n" +
                "2-Banana \n" +
                "3-Calça \n" +
                "4-Desinvetante \n" +
                "Digite uma das opções: ");
        cod = sc.nextInt();

        switch (cod){
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
                System.out.println("Não-perecível");
                break;
            case 3:
                System.out.println("Vesturario");
                break;
            case 4:
                System.out.println("Limpeza");
                break;
            default:
                System.out.println("invalida");
                break;
        }

        System.out.println("Voce escolheu a categoria " + cod );
    }
}
