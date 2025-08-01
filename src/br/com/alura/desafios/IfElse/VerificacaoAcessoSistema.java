package br.com.alura.desafios.IfElse;

import java.util.Scanner;

public class VerificacaoAcessoSistema {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int codigoCorreto = 2025;
            int nivelPermissaoMinimo = 1;
            int nivelPermissaoMaximo = 3;

            System.out.print("Digite o código de acesso: ");
            int codigoDigitado = scanner.nextInt();

            System.out.print("Digite o nível de permissão: ");
            int nivelPermissao = scanner.nextInt();

            boolean codigoValido = codigoDigitado == codigoCorreto;
            boolean permissaoValida = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

            if (codigoValido && permissaoValida) {
                System.out.println("Acesso permitido. Bem-vindo ao sistema!");
            } else {
                System.out.println("Acesso negado. Motivo(s):");
                if (!codigoValido) {
                    System.out.println("- Código de acesso incorreto.");
                }
                if (!permissaoValida) {
                    System.out.println("- Nível de permissão inválido.");
                }
            }
        }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o código de acesso: ");
//        int codigo = scanner.nextInt();
//
//        System.out.print("Digite o nível de permissão: ");
//        int nivel = scanner.nextInt();
//
//        boolean codigoAcesso = codigo == 2021;
//        boolean nivelPermissao = nivel == 1 || nivel == 2 || nivel == 3;
//
//        if (codigoAcesso && nivelPermissao) {
//            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
//        } else {
//            System.out.println("⚠ Acesso negado. \nMotivo:");
//            if (!codigoAcesso) {
//                System.out.println("- Código incorreto!");
//            }
//            if (!nivelPermissao) {
//                System.out.println("- Nível de permissão inválido!");
//            }
//        }
//        scanner.close();
//    }
}
