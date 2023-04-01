package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg473 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		int x;
		System.out.println("Digite a letra: ");
		c = sc.next();
		x = maiuscula(c);
		if(x==1) {
			System.out.println("É uma consoante");
		} else {
			System.out.println("Não é uma consoante");
		}
		sc.close();

	}
	private static int maiuscula(String letra) {
        if (!letra.equals("A") && !letra.equals("a") && !letra.equals("E") && !letra.equals("e")
                && !letra.equals("I") && !letra.equals("i") && !letra.equals("O") && !letra.equals("o")
                && !letra.equals("U") && !letra.equals("u")) {
            return 1;
        } else {
            return 0;
        }
	}
}
