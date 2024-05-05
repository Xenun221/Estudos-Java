import java.util.Scanner;

public class _07EstruturaSwitchCase {
    public static void main(String[] args) {
        //Estrutura switch case e usada quandi se ten varias opcões de fluxo a serem tradas
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Digita os dias: ");
        x = sc.nextInt();
        String dias;

        switch (x){
            case  1:
                dias = "Domingo";
                break;//Obrigado a usar o break no finnal de cada caso
            case  2:
                dias = "Segunda";
                break;
            case 3:
                dias = "Terça";
                break;
            case 4:
                dias = "Quarta";
                break;
            case 5:
                dias = "Quinta";
                break;
            case 6:
                dias = "Sexta";
                break;
            case 7:
                dias = "Sabado";
                break;
            default: //Caso o usuario digite alum valor errado
                dias = "Valor invalido";
                break;

        }
        System.out.println("Dia da semana " + dias);
    }
}
