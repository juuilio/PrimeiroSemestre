package ado7;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("texto");
		String txt = ler.nextLine();
		String txtInv = txt, txtInv2 = "";
		int tam = txt.length();
		int mat = 0;
		tam--;
		for (int cont = tam; cont > 0; cont--) {
			txtInv2 = txtInv.replace(txtInv.charAt(cont), txt.charAt(mat));
			mat++;
		}
	System.out.println(txtInv2);	
	}
}