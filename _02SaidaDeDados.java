import java.util.Locale;

public class _02SaidaDeDados {
    public static void main(String[] args) {

        int y = 32;
        System.out.println(y);

        double x = 10.35784;
        System.out.println(x);

        double g = 10.32332;

        //Controlar as casas decimais
        System.out.printf("%.2f\n", g);
        //.2f(Quantidade de casas deciamis) \n quebra de linha

        System.out.println("Bom dia"); //Com quebra de linha

       // System.out.print("Boa noite"); //Sem quebra de linha

        //Printf pega o aspecto do pc que vc esta usando

        //Configurando a localização
        Locale.setDefault(Locale.US);

        //Juntar varios elemento = Concatener
        double metros = 10.32753;
        double metros2 = 10.3273;
        System.out.println("Resultado = " + metros + " METROS");

        //Usando o PRINTF
        System.out.printf("Resultado = %f metros%n", metros2);

        //EXEMPLO FINAL
        String nome= "Maria";
        int idade = 33;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n",nome, idade, renda);

        //%s=STRING %d=INT  %F= DOUBLE
    }
}
