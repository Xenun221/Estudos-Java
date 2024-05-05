public class _09EscopoeInicializacao {
    public static void main(String[] args) {
        /*
         double price = 400.00;
         //Tenho que sempre inicializar a váriavel par ela funcionar
        System.out.println(price);
         */


        //Escopo
        double price = 400.00;
        double discount ;
        if(price < 200.00){
            discount = price * 0.1;
            //TENHO QUE COLOCAR A VARIAVEL DISCOUNT DENTRO DO ESCOPO
        }
        else {
            discount = 0; //Posso declarar a variavel aqui tambem mas sempre precisa estar com um valor atribuido
        }
        System.out.println(discount);





    }
}
