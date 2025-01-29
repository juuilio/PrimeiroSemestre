package ado7;

import java.util.Scanner;

public class ex12 {
	 public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("numero");
		int num = ler.nextInt();
		int ref = 1;
		int contador = 1;
		if(num == 0 || num == 1){
			System.out.println("numero informado não é primo");
		}
		else {	
			do {
			
				if (num % ref == 0) {
					contador++;
				}
				if (contador > 2 || num == 1) {
				break;
				}
				
				ref++;
			} while(ref != num);
		
			if (contador == 2) {
				System.out.println("o numero informado é primo");
			}
			else if (contador > 2 || num == 1){
				System.out.println("o numero informado não é primo");
			}
		}
	}
}
