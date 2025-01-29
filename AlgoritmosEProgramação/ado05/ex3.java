package ado5;

import java.util.Scanner;

public class ex3 {
	public static void main(String[]args){
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe as três notas do aluno");
		Double [] notas = new Double [3];
		for (int pos = 0; pos<3; pos++) {
			notas[pos] = ler.nextDouble();
		}
		double media = (notas[0] + notas[1] + notas[2])/3;
		String stts = "";
		System.out.println("Informe a quantidade de faltas do aluno");
		int faltas = ler.nextInt();
		if (faltas > 30) {
			System.out.print("Aluno reprovado");
		}
		else {
			if (media == 0) {
				stts = "desistente";
			}
			else if (media < 3) {
				stts = "reprovado";
			}
			else if (media < 6) {
				stts = "recuperação";
			}
			else if (media < 8) {
				stts = "aprovado";
			}
			else {
				stts = "aprovado com sucesso";
			}
			System.out.println(stts);
		}
		
		
	}
}
