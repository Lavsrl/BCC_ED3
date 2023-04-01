package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg465 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Digite numero 1");
		num1 = sc.nextInt();
		System.out.println("Digite o numero 2");
		num2 = sc.nextInt();
		verifica(num1,num2);
		sc.close();
	}

	static void verifica(int n1, int n2) {
		if(n1 < n2) {
			System.out.println("O maior numero é: " + n2);
		} else {
			System.out.println("O maior numero é: " + n1);
		}
	}
}
