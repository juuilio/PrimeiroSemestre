package ado8PI;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] normal = new int[ler.nextInt()];
		int tam = normal.length;
		int[] dobro = new int[tam];
		tam--;
		for (int n = 0; n <= tam; n++)	{
			normal[n] = ler.nextInt();
			dobro[n] = normal[n] * 2;
		}
		for(int n = 0; n <= tam; n++) {
			System.out.println(normal[n]);
		}
		for(int n = 0; n <= tam; n++) {
			System.out.println(dobro[n]);
		}
	}
}
