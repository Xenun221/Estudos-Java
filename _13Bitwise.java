import java.util.Scanner;

public class _13Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mask = 32;
        int n = sc.nextInt();


         if((n & mask) != 0 ){
             System.out.println("6th bit is true");
         }
         else {
             System.out.println("6th is false");
         }






















        sc.close();
        /*
        int n1 = 89;
        int n2 = 60;

        // VAI PEGAR BIT A BIT E VAI FZ A CONTA
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2 );

         */
    }
}
