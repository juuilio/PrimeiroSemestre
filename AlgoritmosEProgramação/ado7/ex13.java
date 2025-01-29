package ado7;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("qual termo da sequência de fibonacci você deseja saber?");
		int num = ler.nextInt();
		int primeiro = 0, segundo = 1, soma = 0;
		if (num == 0) {
			soma = 1;
		}
		else if (soma == 1) {
			soma = 1;
		}
		else {
			for (int pos = 0; pos != num; pos++) {
				soma = primeiro + segundo;
				primeiro = segundo;
				segundo = soma;
				
			}
		}
		System.out.println(soma);
	}
}
