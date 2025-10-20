package Atividade12b;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        int base = sc.nextInt();
        System.out.println(" Digite a altura:");
        int altura = sc.nextInt();
        int resultado = base*altura/2;
        System.out.println("a área do triângulo é:" +resultado);
    }
}
