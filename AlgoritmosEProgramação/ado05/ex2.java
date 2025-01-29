package ado5;

import java.util.Scanner;

public class ex2 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("informe as duas cores primárias");
		String[] cor = new String [3];
		cor [0] = ler.nextLine();
		cor [1] = ler.nextLine();
		
		if (cor[1].equalsIgnoreCase("vermelho") && cor[0].equalsIgnoreCase("amarelo") || cor[1].equalsIgnoreCase("amarelo") && cor[0].equalsIgnoreCase("vermelho")) {
			cor[2] = "laranja";
		}
		else if (cor[1].equalsIgnoreCase("vermelho") && cor[0].equalsIgnoreCase("azul") || cor[1].equalsIgnoreCase("azul") && cor[0].equalsIgnoreCase("vermelho")) {
			cor[2] = "roxo/violeta";
		}
		else if (cor[1].equalsIgnoreCase("azul") && cor[0].equalsIgnoreCase("amarelo") || cor[1].equalsIgnoreCase("amarelo") && cor[0].equalsIgnoreCase("azul")) {
			cor[2] = "laranja";
		}
		else {
			System.out.println("Cor informada inválida\nReinicie o programa");
			System.exit(0);
		}
		System.out.printf("A mistura das cores %s e %s da a cor %s", cor[0], cor[1], cor[2]);
	}
}
