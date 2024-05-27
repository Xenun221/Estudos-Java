import java.util.Scanner;

public class _16SemOrientacaoaObjeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the masures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        /*Valor de Y*/
        System.out.println("Enter the masures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();


        double p = (xA + xB + xC) /2;
        double area = Math.sqrt(p *(p - xA ) * (p - xB) * (p - xC));


        p = (yA + yB + yC) /2;
        double areaY = Math.sqrt(p *(p - yA ) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f%n ", area);
        System.out.printf("Triangle y area: %.4f%n", areaY);

        if (area > areaY){
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Large area: Y");
        }





    sc.close();
    }
}
