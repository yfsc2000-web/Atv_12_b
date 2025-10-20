package Atividade12b;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do raio do circulo:");
        int raio = sc.nextInt();
        double pi = 3.14159;
        double resultado = Math.pow(raio,2)*pi;
        System.out.printf("a area é: %.2f%n" , resultado );

    }
}
