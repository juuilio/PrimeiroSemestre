package ado5;

import java.util.Scanner;

public class ex1 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe os três lados do triângulo");
		double[] lado = new double [3];
		lado [0] = ler.nextDouble();
		lado [1] = ler.nextDouble();
		lado [2] = ler.nextDouble();
		String tipo = "";
		if (Math.abs(lado[1]) - Math.abs(lado[2]) < lado[0] && lado [0] < lado[1] + lado[2] || Math.abs(lado[0]) - Math.abs(lado[2]) < lado[1] && lado [1] < lado[0] + lado[2] || 
				Math.abs(lado[0]) - Math.abs(lado[1]) < lado[2] && lado [2] < lado[1] + lado[0]) {
			if (lado[0] == lado[1] && lado[0]==lado[2]) {
				tipo = "equilátero";
			}
			else if (lado[0] == lado[1] && lado[1] != lado[2] || lado[0] == lado[2] && lado[1] != lado [2] || lado[1] == lado[2] && lado[0] != lado[2]) {
				 tipo = "isósceles";
			}
			else if(lado[0] != lado [1] && lado[0] != lado[2]) {
				tipo = "escaleno";
			}
			
		}
		else {
			System.out.println("Este triângulo não existe\nReinicie o programa");
			System.exit(0);
		}
		System.out.printf("Este é um triângulo do tipo %s", tipo);
		
		
	}
}
