package br.com.alura.desafios.IfElse;

import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();

        scanner.close();

        if (dia.equals("segunda") || dia.equals("terca") ||
                dia.equals("quarta") || dia.equals("quinta") ||
                dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil.");
        } else {
            System.out.println(dia + " não é um dia útil.");
        }

//        if (dia == "segunda"  || dia == "terça" || dia == "quarta" || dia == "quinta" || dia =="sexta") {
//            System.out.printf(dia + " é um dia útil.");
//        } else {
//            System.out.printf(dia + " é um dia útil.");
//        }

    }
}
