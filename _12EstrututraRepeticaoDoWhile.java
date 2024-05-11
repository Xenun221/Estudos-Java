import java.util.Scanner;

public class _12EstrututraRepeticaoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;
       do{
           System.out.println("Digite a temperatura em Celsius: ");
           double c = sc.nextDouble();
           double F = 9.0 * c / 5.0 + 32.0;
           System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
           System.out.print("Deseja repetir (S/N)");
           resp = sc.next().charAt(0);
       } while (resp != 'N');









        sc.close();
    }
}
