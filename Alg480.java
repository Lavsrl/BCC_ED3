package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg480 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		int n = sc.nextInt();
		int x = reverso(n);
		System.out.println(n + " - " + x);
		if (x == n) {
			System.out.println("É um numero capicua");
		} else {
			System.out.println("Não é um numero capicua");
		}
		sc.close();
	}
	
	private static int reverso(int num) {
		int soma, r;
		soma = 0;
				while(num != 0) {
					r = num % 10;
					soma = soma * 10 + r;
					num = num/10;
				}
		return(soma);

	}

}
