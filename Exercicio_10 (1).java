import java.util.Scanner;

public class Exercicio_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();
        System.out.println("Digite o terceiro número:");
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) /3;
        System.out.println("A média aritmética é:" +media);
    }
}
