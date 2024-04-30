public class _03ProcessamentoDeDados {
    public static void main(String[] args) {
        int x,y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        //Exemolo2

        //double y vai imprimir como 1.0 por causa do DOUBLE


        //Exemplo 3
        double b, B, h, area;

        b = 6.0;
        B= 8.0;
        h = 5.0;

        area = (b +8) / 2.0 * h;
        System.out.println(area);


        //Exemplo CASTING
        int g, c;
        double resultado;

        g = 5;
        c = 2;

        resultado = (double) g/c; //Casting que a conversão explicita dos valores

        System.out.println(resultado);

    }
}
