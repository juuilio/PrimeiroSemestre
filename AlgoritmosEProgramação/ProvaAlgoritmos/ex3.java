package provaAlgoritmos;

import java.util.Random;

public class ex3 {
	static Random rand = new Random();
	public static void main(String[] args) {
		System.out.println("A soma das colunas pares dividida pela soma das colunas impares é: " + matriz());
	}
	
	public static double matriz() {
		int coluna = rand.nextInt(1,11), linha = rand.nextInt(1,11);
		double colunaPar = 0, colunaImpar = 0;
		int[][] array = new int[coluna][linha];
			for (int c = 0; c < array.length; c++) {
				for(int l = 0; l < linha; l++) {
					array[c][l] = rand.nextInt(0,101);
					if (l % 2 == 0) {
						colunaImpar += array[c][l];
					}
					else {
						colunaPar += array[c][l];
					}
				}
			}
		colunaPar /= colunaImpar;
		return colunaPar;
	}
}
