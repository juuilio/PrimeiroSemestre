package ado5;

import java.util.Scanner;

public class ex4 {
	public static void main(String[]aegs) {
		Scanner ler = new Scanner(System.in);
		Double [] num = new Double[3];
		System.out.println("Informe os dois valores");
		num[0] = ler.nextDouble();
		num[1] = ler.nextDouble();
		System.out.println("Informe a operação");
		String op = ler.next();
		
		if (op.equalsIgnoreCase("soma")) {
			num[2] = num[0] + num[1];
		}
		else if (op.equalsIgnoreCase("divisão")) {
			num[2] = num[0] / num[1];
		}
		else if (op.equalsIgnoreCase("multiplicação")) {
			num[2] = num[0] * num[1];
		}
		else if (op.equalsIgnoreCase("subtração")) {
			num[2] = num[0] - num[1];
		}
		else if (op.equalsIgnoreCase("resto da divisão")) {
			num[2] = num[0] % num[1];
		}
		else if (op.equalsIgnoreCase("potência")) {
			num[2] = Math.pow(num[0], num[1]);
		}
		else {
			System.out.println("Operação não suportada");
			System.exit(0);
		}
		System.out.print("Resultado " + num[2]);
	}
}
