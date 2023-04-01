package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int dob;
		
		for(int c = 1; c<=3; c++) {
			System.out.println("digite o numero: ");
			a = sc.nextInt();
			System.out.println("dobro: " + dob(a));
		}
			sc.close();
		}
		

	private static int dob(int a) {
		return(a * 2);
		
	}

}
