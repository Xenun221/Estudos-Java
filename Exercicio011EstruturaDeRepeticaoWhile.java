import java.util.Scanner;

public class Exercicio011EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;
        System.out.println("Digite a senha: ");
        senha = sc.nextInt();
        int x = 0;

        while(senha != 2002){
            System.out.println("Senha Errada");
            senha = sc.nextInt(); //C0LOCAR PARA QUEBRAR
        }
        System.out.println("Acesso liberado");

        sc.close();
    }
}
