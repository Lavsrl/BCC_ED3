package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg487 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int l;
		for( l = 0; l < 10; l++) {
			System.out.println("Digite numero " + (l +1) + ": ");
			num[l] = sc.nextInt();
		}
		inverte(num, 10);
		for(l = 0; l < 10; l++) {
			System.out.println((l+ 1) + " - " + num[l]);
		}
		
		sc.close();
	}
	 static void inverte(int vet[], int max) {
	        int k, i, aux;

	        k = max - 1;

	        for (i = 0; i < max / 2; i++) {
	            aux = vet[i];
	            vet[i] = vet[k];
	            vet[k] = aux;
	            k--;
	        }
	    }
}
