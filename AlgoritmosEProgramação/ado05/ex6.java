package ado5;

import java.util.Scanner;

public class ex6 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("informe o curso");
		String curso = ler.nextLine();
		System.out.println("informe se é insento, sim/não");
		String esc = ler.nextLine();
		System.out.println("informe o seu desconto");
		Double desc = ler.nextDouble();
		Double valor = 0.0;
		
		if (esc.equalsIgnoreCase("sim")) {
			System.out.print("você não paga nada");
			System.exit(0);
		}
		else {
			if (curso.equalsIgnoreCase("si")) {
				valor = 550 * (desc/100);
			}
			else if (curso.equalsIgnoreCase("ads")) {
				valor = 750 * (desc/100);
			}
			else if (curso.equalsIgnoreCase("cs")) {
				valor = 1150 * (desc/100);
			}
			else if (curso.equalsIgnoreCase("ec")) {
				valor = 1300 * (desc/100);
			}
			else if (curso.equalsIgnoreCase("es")) {
				valor = 950 * (desc/100);
			}
		}
		System.out.println("voce paga " + valor);
		
		
	}
}
