import java.util.Scanner;

public class Exercico010EstruturaSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String letra;
        System.out.println("Digite uma letra: ");
        letra = sc.nextLine();
        String op;

        switch (letra){
            case "a":
                System.out.println("A letra " + letra + " e uma vogal");
                break;
            case "e":
                System.out.println("A letra " + letra + " e uma vogal");
                break;
            case "i":
                System.out.println("A letra " + letra + " e uma vogal");
                break;
            case "o":
                System.out.println("A letra " + letra + " e uma vogal");
                break;
            case "u":
                System.out.println("A letra " + letra + " e uma vogal");
                break;
            default:
                System.out.println("a letra " + letra + " e uma consoante");
        }
    }
}
