package ado7;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("texto");
		String txt = ler.nextLine();
		int tam = txt.length();
		int mat = 0;
		tam--;
		
		if (tam % 2 == 0) {
			for (int cont = tam; cont < 0; cont--) {
				mat++;
				if (txt.charAt(cont) == txt.charAt(mat)) {
					continue;
				}
				else {
					System.out.println(txt + " não é um palindromo");
				}
			}
		}
		else {
			System.out.println(txt + " não é um palindromo");
		}
		System.out.println(txt + " é um palindromo");
	}
}
