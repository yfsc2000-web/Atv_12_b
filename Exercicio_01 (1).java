package Atividade12b;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int numero2 = sc.nextInt();
        int soma = numero1 + numero2;
        System.out.println("a soma entre " +numero1+ " e "+numero2+" é = "+soma );

    }
}
