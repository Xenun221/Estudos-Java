import java.util.Scanner;

public class _06EstruturaCondicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int hora;
        System.out.println("Quantas horas? ");
        hora = sc.nextInt();


        //Estrutura condicional IF:(Simples)
        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else{ //Estrutura Condicional: Composta(If-Else)
            if (hora < 18) {//Estrutura condicional: Encadeada(If-Else-if)
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        }

        sc.close();

    }
}
