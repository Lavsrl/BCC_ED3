package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg494 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Sytem.in);
		int l, c, t, t2;
		String nome[] = new String[3];
		String prof[] = new String[3];
		String ender[] = new String[3];
		
		for(l = 0; l < 3; l++) {
			System.out.println("Digite nome: ");
			nome[l] = sc.next();
			System.out.println("Digite endereco: ");
			ender[l] = sc.next();
			System.out.println("Digite profissao: ");
			prof[l] = sc.next();
		}
		
		for(l = 0; l < 2; l++) {
			for(c = l + 1; c < 3; c++) {
				if(nome[l] > nome[c]) {
					troca(nome[l], nome[c]);
					troca(ender[l], ender[c]);
					troca(prof[l], prof[c]);
				}
			}
		}
		
		sc.close();

	}
	private static void troca(String n1, String n2) {
        String aux = n1;
        n1 = n2;
        n2 = aux;
    }
}
