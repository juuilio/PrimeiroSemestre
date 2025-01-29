package ado5;

import java.util.Scanner;

public class ex5 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a nota do aluno, a nota de corte e a nota miníma de aprovação");
		Double[] notas = new Double[3];
		notas[0] = ler.nextDouble();
		notas[1] = ler.nextDouble();
		notas[2] = ler.nextDouble();
		
		if (notas[0] > notas[1] && notas[0] < notas[2]) {
			System.out.print("aluno esta na fila de espera");
		}
		else if (notas[0] > notas[2]) {
			System.out.print("candidato aprovado");
		}
		
		else if (notas[0] < notas[1]) {
			System.out.print("candidato não passou");
		}
		
	}
}
