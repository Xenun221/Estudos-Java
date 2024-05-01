import java.util.Scanner;

public class _04EntradaDeDados02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); //Resolvendo o problema de quebra de linha
        s1 = sc.nextLine();  //LER O TEXTO ATE A QUEBRA DE LINHA
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Voce Digitou: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
