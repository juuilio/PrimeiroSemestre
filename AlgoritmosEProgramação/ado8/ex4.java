package ado8PI;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] num = new int[ler.nextInt()];
		int tam = num.length;
		tam--;
		
		for (int n = 0; n <= tam; n++) {
			num[n] = ler.nextInt();
		}
		System.out.println("numeros digitados");
		for (int n = tam; n >= 0; n--) {
			System.out.println(num[n]);
		}
	}
}