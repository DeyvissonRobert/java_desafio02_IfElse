package br.com.alura.desafios.IfElse;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        int valor = scanner.nextInt();

        if (valor > 1000 && valor < 5000) {
            System.out.printf("O valor de " + valor + ", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.printf("O valor de " + valor + ", não está dentro do intervalo permitido para empréstimo.");
        }
        scanner.close();

    }
}
