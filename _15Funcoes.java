import java.util.Scanner;

public class _15Funcoes {
    public static void main(String[] args) {
        //Funcoes Math
        /*
        double  x = Math.sqrt(25.0);
        System.out.println(x);
        */

        //Exemplo1 ler o maior numeros dos 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva 3 numeros: ");

        int a;
        System.out.println("Escrva o valor do primeiro numero: ");
        a = sc.nextInt();

        int b;
        System.out.println("Escrva o valor do segundo numero: ");
         b = sc.nextInt();

        int c;
        System.out.println("Escrva o valor do terceiro numero: ");
        c = sc.nextInt();

        //LOGICA PARA SABER QUAL E O MAIOR VALOR
        /*
        if(a > b && a >c ){
            System.out.println("Primeiro valor e o maior: "+ a);
        } else if (b > c) {
            System.out.println("Seugndo valor e o maior: " + b);
        }
        else {
            System.out.println("Terceiro valor e o maior: " + c);
        }
         */

        //Utilizando função para minimizar
        int higher = max(a,b,c);
        showResult(higher);



        sc.close();
    }
    //Criando a Função MAX
    public  static int max(int x, int y, int z){
        //Não precisa ser o mesmo nome da função
        int aux;
        if(x > y && x >z ){
            aux = x;
        } else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
    public  static void showResult(int value){
        System.out.println("Higher = " + value);
    }

}
