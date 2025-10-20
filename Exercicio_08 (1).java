import java.util.Scanner;

public class Exercicio_08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        int quociente = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Resultado da divisão inteira: " + quociente);
        System.out.println("Resto da divisão: " + resto);

    }
}
