package ado8PI;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = ler.nextInt();
		for (int n = 0; n <= 10; n++) {
			System.out.println(num * n);
		}
		
	}
}
