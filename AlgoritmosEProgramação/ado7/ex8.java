package ado7;

import java.util.Scanner;

public class ex8 {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("texto");
		
		String texto = ler.nextLine().toUpperCase();
		String[] div = texto.split("");
		String saida = String.join("-",div);
		
		System.out.println(saida);
	}
}