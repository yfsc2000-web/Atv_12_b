package Atividade12b;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salario:");
        double valor = sc.nextDouble();
        double resultado = valor *0.10;
        System.out.println("O salário com o aumento de 10% é:" + resultado);



    }
}
