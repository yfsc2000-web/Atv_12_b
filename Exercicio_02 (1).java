package Atividade12b;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número real:");
        double numeroReal = sc.nextInt();
        double soma = numeroReal*2;
        System.out.println("O dobro da soma é:" +soma );
    }
}
