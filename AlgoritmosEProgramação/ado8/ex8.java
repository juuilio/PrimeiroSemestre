package ado8;

import java.util.Random;
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		int[] doctorRay = new int[rand.nextInt(0,101)];
		int tam = doctorRay.length;
		
		for (int n = 0; n < tam; n++) {
			doctorRay[n] = rand.nextInt(0,101);
			System.out.println(doctorRay[n]);
		}	
	}
}
