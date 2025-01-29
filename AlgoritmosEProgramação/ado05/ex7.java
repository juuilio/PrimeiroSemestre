package ado5;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("informe a quantidade de ingressos (inteiras)");
		int inteira = ler.nextInt();
		System.out.println("informe a quantidade de ingressos (meias)");
		int meia = ler.nextInt();
		System.out.println("infome o dia da semana");
		String dia = ler.next();
		System.out.println("o filme é nacional? (sim ou não)");
		String filme = ler.next();
		double preço = 0;
		if (filme.equalsIgnoreCase("sim")) {
			preço = (meia + inteira) * 5;
		}
		else if (dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quarta-feira")) {
			preço = (meia +  inteira) * 14.25;
		}
		else {
			preço = (meia * 14.25) + (inteira * 28.5);
		}
		System.out.printf("você deve pagar %.2f", preço);
		
		
	}
}
