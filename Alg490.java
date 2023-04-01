package exerciciosAlgoritimos3;

import java.util.Scanner;

public class Alg490 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        String nome[] = new String[10];
        for (l = 0; l < 10; l++) {
            System.out.println("Digite palavra em letras minusculas " + (l + 1) + ": ");
            nome[l] = sc.next();
            nome[l] = restantes(nome[l], nome[l].length(), "c");
        }
        for (l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + nome[l]);
        }

        sc.close();
    }

    private static String restantes(String palavra, int tam, String x) {
        String resultado = "";
        for (int i = 0; i < tam; i++) {
            if (palavra.charAt(i) == x.charAt(0)) {
                resultado += "*";
            } else {
                resultado += palavra.charAt(i);
            }
        }
        return resultado;
    }
}
