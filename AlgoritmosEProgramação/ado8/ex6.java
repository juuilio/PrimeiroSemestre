package ado8PI;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra = ler.nextLine();
		String[] div = palavra.split("");
		int tam = palavra.length();
		for(int n = 0; n < tam; n++) {
			System.out.println(div[n]);
		}
	}
}
