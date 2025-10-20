package Atividade12b;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Digite uma temperatura em graus celsius:");
        double Celsius = sc.nextDouble();
        double resultado = (Celsius *9/5) + 32;
        System.out.println("A temperatura em fahrenheit é: %.2f%n"  +resultado);

    }
}
