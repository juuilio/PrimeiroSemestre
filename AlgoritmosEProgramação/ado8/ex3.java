package ado8;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] num = new int[ler.nextInt()];
		int tam = num.length;
		tam--;
		
		for (int n = 0; n <= tam; n++) {
			num[n] = ler.nextInt();
		}
		System.out.println("numeros digitados");
		for (int n = 0; n <= tam; n++) {
			System.out.println(num[n]);
		}
	}
}
