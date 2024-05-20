public class _14FuncoesString {
    public static void main(String[] args) {
        String original =  "abc ACB FGH ihj0";

        //Imprimir com letras minusculas
        String s01 = original.toLowerCase();
        System.out.println("To Lower case - " + s01);

        //Com letra maiusculas
        String s02 = original.toUpperCase();
        System.out.println("To Upper Case - " + s02);

        //Imprimir sem espaços
        String s03 = original.trim();
        System.out.println("Trim - " + s03);

        //Substring - Pegar somente o carater da posição 2 em diante e montar uma cadeia de caracters
        String s04 = original.substring(2);
        System.out.println("Substring - " + original);

        //Subtring a partir de quanto ate quanto
        String s05 = original.substring(2, 9);
        System.out.println("Substring(2,9)" + s05);

        //Substituir
        String  s06 = original.replace("a", "X");
        System.out.println("Replace de a por X" + s06);

        //Replace para subtring
        String s07 = original.replace("abc", "xy");
        System.out.println("Replace abc por xy" + original);


        int i = original.indexOf("ab");
        int j = original.lastIndexOf("c");

        //Primeira ocorrencia
        System.out.println("Index of " + i);

        //Ultima Ocorrencia
        System.out.println("Last index of " + j);




        //Recortar o string
        String s = "potato apple lemon";

        String [] vect = s.split(" ");
        String  word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        /* SPLITE RECORTAR AS PALAVRAS*/


    }
}
