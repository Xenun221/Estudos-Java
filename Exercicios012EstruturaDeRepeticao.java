import java.util.Scanner;

public class Exercicios012EstruturaDeRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tipo;
        System.out.println("Digite o que voce quer \n" +
                "1-Alcool \n" +
                "2-Gasoline \n" +
                "3-Disel ");
        tipo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        while (tipo != 4){
            System.out.println("Digite o que voce quer \n" +
                    "1-Alcool \n" +
                    "2-Gasoline \n" +
                    "3-Disel ");
            if(tipo == 1){
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;

            } else if (tipo == 3) {
                disel += 1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel " + disel);

        sc.close();
    }

}
