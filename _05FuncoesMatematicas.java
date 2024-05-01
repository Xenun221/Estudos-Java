public class _05FuncoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = 5.0;
        double A,B,C;


        //RAIZ QUADRADA
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        System.out.println("Raiz quadrada de "+ x + " = "+ A);
        System.out.println("Raiz quadrada de "+ y + " = "+ B);
        System.out.println("Raiz quadrada de 25  = "+ C);
        System.out.println("\n");

       //Potencia
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " Elevado ao quadrado " + y + " = " + A);
        System.out.println(x + " Elevado ao quadrado = " + B);
        System.out.println("5 Elevado a  = " + C);
        System.out.println("\n");

        //VALOR ABSOLUTO
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de: "+ y + " = " + A);
        System.out.println("Valor absoluto de: "+ z + " = " + B);
    }
}
