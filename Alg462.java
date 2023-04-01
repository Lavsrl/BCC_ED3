package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg462 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3;
		System.out.println("Digite a nota 1: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		n3 = sc.nextDouble();
		
		System.out.println("A media aritmetica eh de: " + media(n1, n2, n3));
		System.out.println("Media armazenada em variavel: " + media(n1, n2, n3));
		
		sc.close();
	}
	
	private static double media(double x, double y, double z) {
		return (x + y + z)/3;
		
	}

}
