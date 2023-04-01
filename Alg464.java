package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg464 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rad;
		System.out.println("Digite o angulo em radianos:");
		rad = sc.nextDouble();
		System.out.println("radianos: " + rad);
		System.out.println("Em graus: "+ graus(rad));
		sc.close();
	}
	private static double graus(double rad) {
		double pi = 3.14;
		return (rad * 180)/pi;		

	}

}
