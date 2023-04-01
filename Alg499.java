package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int flag = 0;
        int op;
        int num[] = new int[5];


        while (true) {
            System.out.println("MENU VETOR - FUNCAO");
            System.out.println("1 - Dados do vetor");
            System.out.println("2 - Ordena vetor");
            System.out.println("3 - Imprime vetor");
            System.out.println("4 - Sai do programa");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    entrada(num);
                    flag = 1;
                    break;

                case 2:
                    if (flag == 1) {
                        ordena(num);
                    } else {
                        System.out.println("Escolha a primeiro a opção 1");
                    }
                    break;

                case 3:
                    if (flag == 1) {
                        imprime(num);
                    } else {
                        System.out.println("Escolha a primeiro a opção 1");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do algoritmo");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

	}
	public static void entrada(int[] vet) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada do vetor: ");

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }
    }

    public static void imprime(int[] vet) {
        System.out.println("Vetor");

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    public static void ordena(int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
    }

}
