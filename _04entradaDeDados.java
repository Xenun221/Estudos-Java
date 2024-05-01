import java.util.Scanner;//Importação do Scanner

public class _04entradaDeDados {
    public static void main(String[] args) {

        //Scanner para iniciar
        Scanner sc = new Scanner(System.in);


        //Leitura de uma palavra através do teclado
        String x;
        x = sc.next();
        System.out.println("Voce digitou: "+ x);

        //PARA ler NUMEROS INTEIROS:
        int y;
        y = sc.nextInt();
        System.out.println("Voce tem " + y + " anos");

        //Para ler numeros com ponto flutuante
        double z;
        z = sc.nextDouble();
        System.out.printf("Voce tem %.2f Metros de altura", z);

        //CHAR X
        char v;
        v = sc.next().charAt(0);
        System.out.println("Voce digitou: "+ v);
        //CHARAT(0) VAI PEGAR SOMENTE A PRIMEIRA LETRA QUE VC DIGITOU


        //PARA FAZER TUDO DE UMA VEZ
        String g;
        int a;
        double b;

        g = sc.next();
        a = sc.nextInt();
        b = sc.nextDouble();
        System.out.println("Dados Digitados: ");
        System.out.println(g);
        System.out.println(a);
        System.out.println(b);

        sc.close(); //Encerrar o recurso
    }
}
