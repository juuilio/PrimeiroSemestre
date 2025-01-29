package ado7;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("notas");
		double[] nota = new double[3];
		int i = 0;
		
		do {
		nota[i] = ler.nextDouble();
			if (nota[i] <= 0 || nota[i] >= 10) {
				System.out.println("Nota inválida, informe novamente");
				continue;
			}
			i++;
		}while ( i < nota.length);
		
		double media = (nota[0] + nota[1] + nota [2]) / 3;
		System.out.println("A media é de " + media);
		
	}
}