package provaAlgoritmos;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("informe a quantidade de linhas e colunas");
		int colunas = ler.nextInt();
		int linhas = ler.nextInt();
		String [][] desenho = new String[colunas][linhas];
		
		for(int c = 0; c < desenho.length; c++) {
			for(int l = 0; l < linhas; l++) {
				if (c == 0) {
					System.out.print(": ");
				}
				else if (l == 1 && c != 0 && c != (colunas - 1)) {
					System.out.print(".");
				}
				else if (c == (colunas - 1)) {
					System.out.print("- ");
				}
			}
			System.out.println("");
		}
		
		
	}
}
