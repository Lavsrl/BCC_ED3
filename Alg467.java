package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double log, base;
		for(int c = 1; c <= 3; c++) {
			System.out.println("Digite o logaritmando maior do que 0: ");
			log = sc.nextDouble();
			while (log <= 0) {
				System.out.println("Invalido. Digite o logaritmando maior do que 0: ");
				log = sc.nextDouble();
				}
			System.out.println("Digite base maior que 0 e diferente de 1: ");
			base = sc.nextDouble();
			while(base < 0 || base == 1) {
				System.out.println("Invalido. Digite base maior que 0 e diferente de 1: ");
				base = sc.nextDouble();
				}
			System.out.println("Logaritimo e " + loga(log, base));
		}
		
		sc.close();

	}
	private static double loga(double l, double b) {
		return Math.log(l)/Math.log(b);
	}
}
