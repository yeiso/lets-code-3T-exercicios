package poo_II.aula01;

import java.util.Scanner;

public class aula01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;
        Double n1 = 0.0;
        Double n2 = 0.0;
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();

        do{
            System.out.println("Selecione uma operacao:");
            System.out.printf("1 - Soma %n2 - Subtracao %n3 - Multiplicao %n4 - Divisao %n0 - Sair %n");
            opcao = scanner.nextInt();

            if (opcao > 0 && opcao <= 4) {
                System.out.println("Digite o primeiro valor:");
                n1 = scanner.nextDouble();
                System.out.println("Digite o segundo valor:");
                n2 = scanner.nextDouble();
            }

            switch (opcao) {
                case 1 -> System.out.println(soma.calcular(n1, n2));
                case 2 -> System.out.println(subtracao.calcular(n1, n2));
                case 3 -> System.out.println(multiplicacao.calcular(n1, n2));
                case 4 -> System.out.println(divisao.calcular(n1, n2));
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opcao invalida, digite novamente");
            }
        } while (opcao != 0);
    }
}
