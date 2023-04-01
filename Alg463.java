package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang;
		System.out.println("Digite o angulo em graus:");
		ang = sc.nextDouble();
		System.out.println("Graus: " + ang);
		System.out.println("Em radianos: "+ radiano(ang));
		sc.close();
	}
	private static double radiano(double ang) {
		double pi = 3.14;
		return (ang * pi)/180;
		
	}
}
