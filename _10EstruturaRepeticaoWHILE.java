import java.util.Scanner;

public class _10EstruturaRepeticaoWHILE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //USA-SE WHILE QUANDO N SABE O QUANTO VAI SE REPETIR A ESTRUTURA
        int x;
        System.out.print("Digite um numero: ");
        x = sc.nextInt();
        int soma = 0; //TEM QUE COMEÇAR COM ALGUMA COISA

        while (x != 0){
            soma += x; // SOMA = SOMA + X;
            x = sc.nextInt();
        }
        System.out.println("a soma dos valores foi: " + soma);


        /*
        while ( x != 0){ //VAO LER ENQUANTO O X FOR DIFERENTE DE 0
            x = sc.nextInt();
        }
        System.out.println("Fora"); //PULA FORA SE FOR 0
        */


        sc.close();
    }
}
