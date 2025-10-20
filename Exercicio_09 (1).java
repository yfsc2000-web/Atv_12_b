import java.util.Scanner;

public class Exercicio_09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade em anos:");
        int idade = sc.nextInt();
        int meses = idade*12;
        System.out.println("A sua idade é:" +meses);
    }
}
