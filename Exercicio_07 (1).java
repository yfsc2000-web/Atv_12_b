import java.util.Scanner;

public class Exercicio_07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias:");
        int dias = sc.nextInt();
        int horas = dias*24;
        System.out.println( dias  + " Dias equivalem a " + horas + " horas");
    }
}
