package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, prim;
		System.out.println("Digite um numero maior do que 0: ");
		num = sc.nextInt();
		prim = primo(num);
		if(prim == 0) {
			System.out.println("O número " + num + " é primo ");
		} else {
			System.out.println("O numero " + num + " não é primo");
		}
		sc.close();
	}

	private static int primo(int n) {
		int c, p;
		c = 0;
		p = 2;
		while (c == 0 && p <= n /2) {
            if (n % p == 0) {
                c = 1;
            }
            p++;
        }
        return c;
	}
}
