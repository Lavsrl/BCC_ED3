package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg497 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int l, c, n, aux;
        int num[] = new int[10];

        for (l = 0; l < 10; l++) {
            System.out.println("Digite número " + (l + 1) + ": ");
            num[l] = sc.nextInt();
        }
        System.out.println("Digite o número de busca: ");
        n = sc.nextInt();
        ordena(num , 10);
        c = busca(num,10,n);

        System.out.println("Vetor: ");

        for (l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + num[l]);
        }
        c++;

        if (c != 0) {
            System.out.println("Posição do vetor: " + c);
        } else {
            System.out.println("Não encontrado");
        }
    }
    public static int busca(int[] vet, int tam, int chave) {
        int i,ini,meio,fim,n;
        ini = 0;
        fim = tam - 1;

        while (ini <= fim) {
            meio = (ini + fim) / 2;
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        meio = (-1);
        return meio;
    }
    public static int ordena(int vet[], int tam) {
        int l1, c1, aux;

        for (l1 = 0; l1 < tam - 1; l1++) {
            for (c1 = l1 + 1; c1 < tam; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1]; vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        return l1;
    }

	}

