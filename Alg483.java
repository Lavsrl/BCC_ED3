package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg483 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, c, aux;
		int num1[] = new int[4];
		int num2[] = new int[4];
		for(l = 0; l< 4; l++) {
			System.out.println("Digite o 1 numero: ");
			num1[l] = sc.nextInt();
		}
		for(l = 0; l <4; l++) {
			System.out.println("Digite o 2 numero: ");
			num2[l] = sc.nextInt();
		}
		c = produtoInterno(num1, num2, 4);
		System.out.println("VETOR A " + "		" + "VETOR B");
		for(l = 0; l < 4; l++) {
			System.out.println(num1[l]+ "			" + num2[l]);
		}
		System.out.println("Produto interno: " + c);
		
		sc.close();
	}
	private static int produtoInterno(int vet1[], int vet2[], int quant) {
		int prod, i;
		prod = 0;
		for(i = 0; i < quant; i++) {
			prod = prod + (vet1[i] * vet2[i]);
		}
		return prod;
	}
}
