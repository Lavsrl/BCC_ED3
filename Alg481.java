package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg481 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, base, c;
		System.out.println("Digite um numero maior ou igual a 0: ");
		num = sc.nextInt();
		while(num < 0) {
			System.out.println("Numero negativo. Digite um numero maior ou igual a 0");
			num = sc.nextInt();
		}
		
		System.out.println("Digite a base em que deseja representa-lo(2-10): ");
		base = sc.nextInt();
		while(base < 2 || base > 10) {
			System.out.println("Não é possivel converter. Digite a base em (2-10): ");
			base = sc.nextInt();
		}
		c = converte(num, base);
		
		System.out.println("Numero em decimal: " + num);
		System.out.println("Numero na base " + base + " : " + c);
		
		sc.close();
	}

	private static int converte(int nnum, int nbase) {
		int nb, r, b;
		b = 0;
		nb = 0;
		while (nnum >= nbase) {
			r = nnum % nbase;
			nb = (int) (nb + Math.pow(10, b) * r);
			nnum = nnum / nbase;
			b++;
		}
		nb = (int) (nb + Math.pow(10, b) * nnum);
		return nb;
	}
}
