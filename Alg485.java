package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg485 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, c;
		int num[] = new int[6];
		String num2[] = new String[6];
		
		for(l = 0; l < 6; l++) {
			System.out.println("Digite numero " + (l + 1) + ": ");
			num[l] = sc.nextInt();
		}
		
		for(l = 0; l < 6; l++) {
			System.out.println("Digite caractere " + l + ": ");
			num2[l] = sc.next();
		}
		
		multivetor(num, num2, 6);
		sc.close();

	}
	
	private static void multivetor(int[] vet1, String[] vet2, int tam) {
        int i, w;

        for (i = 0; i < tam; i++) {
            for (w = 0; w < vet1[i]; w++) {
                System.out.print(vet2[i] + " ");
            }
            System.out.println();
        }
    }
}
