import java.util.Scanner;

public class Exercicios01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome1, nome2;
        double salario1, salario2;
        int idade;
        char sexo;

        //ENTRADA DOS DADOS
        System.out.println("Digite o nome da primeiro pessoa: ");
        nome1 = sc.nextLine();
        System.out.println("Digite o salario da primeira pessoa: ");
        salario1 = sc.nextDouble();


        System.out.println("Digite o nome da segunda pessoa: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.println("Digite o salario da segunda pessoa: ");
        salario2 = sc.nextDouble();

        System.out.println("Digite uma idade: ");
        idade = sc.nextInt();
        System.out.println("Digite um sexo [F/M]");
        sexo = sc.next().charAt(0);

        //SAIDA DOS DADOS
        System.out.println("Nome 1:" + nome1);
        System.out.println("Salario 1: " + salario1);
        System.out.println("Nome 2: " + nome2);
        System.out.println("Salario 2" + salario2);
        System.out.println("Idade: "+ idade);
        System.out.println("Sexo: " + sexo);


        sc.close();
    }
}
