package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg471 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividendo, divisor, n;
		System.out.println("Digite o dividendo: ");
		dividendo = sc.nextInt();
		System.out.println("Digite o divisor: ");
		divisor = sc.nextInt();
		while(divisor > dividendo) {
			System.out.println("Invalido. Digite um numero menor do que o dividendo: ");
			divisor = sc.nextInt();
		}
		
		n = divisivel(dividendo, divisor);
		if(n==0) {
			System.out.println("Nenhuma vez");
		} else {
			System.out.println("Numero de vezes: " + n);
		}
		
		sc.close();
	}
	private static int divisivel(int x, int y) {
		int r, n1;
		n1 = 0;
		r = x % y;
		while (r == 0) {
			n1++;
			x = x/y;
			r = x % y;
		}
		return n1;
	}
}
