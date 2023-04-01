package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, c, t, t2;
		String nome[] = new String[5];
		
		for(l = 0; l < 5; l++) {
			System.out.println("Digite nome: ");
			nome[l] = sc.nextLine();
		}
		ordena(nome, 5);
		System.out.println("NOMES ORDENADOS: ");
		for(l = 0; l < 5; l++) {
			System.out.println((l+1) + " - " + nome[l]);
		}
		sc.close();
	}
	
	private static void ordena(String vet[], int tam) {
		int l1, c1;
		String aux;
		for (l1 = 0; l1 < tam-1; l1++) {
            for (c1 = l1 + 1; c1 < tam; c1++) {
                if (vet[l1].compareTo(vet[c1]) > 0) {
                    aux = vet[l1]; vet[l1] = vet[c1]; vet[c1] = aux;
                    
                }
            }
        }
	}
}
