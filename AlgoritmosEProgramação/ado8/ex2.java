package ado8;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String [] num = new String[5];
		int tam = num.length;
		tam--;
		
		for (int n = 0; n <= tam; n++) {
			num[n] = ler.nextLine();
		}
		System.out.println("numeros digitados");
		for (int n = 0; n <= tam; n++) {
			System.out.println(num[n]);
		}
	}
}
