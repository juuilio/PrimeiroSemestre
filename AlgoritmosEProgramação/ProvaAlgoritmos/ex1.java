package provaAlgoritmos;

import java.util.Random;

public class ex1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int aposentados = 0; //62 anos
		int [] idade = new int [700];
		double mediaIdade = 0;
		int menor = 0;
		int aventura = 0, familiar = 0;
		
		for (int c = 0; c < idade.length; c++) {
			idade[c]  = rand.nextInt(0, 91);
			mediaIdade += idade[c];
			if (idade[c] > 62) {
				aposentados++;
			}
			if (idade[c] < 18) {
				menor++;
			}
			int num = rand.nextInt(0,2);
			if (num == 1) {
				aventura++;
			}
		}
		familiar = 700 - aventura;
		mediaIdade /= 700;
		System.out.printf("A quantidade de aposentados é de: %3d\nA quantidade de menores de idade é de: %3d\nA média de idade é de: %.0f\nA quantidade de pessoas que preferem o gênero aventura: %3d\nA quantidade de pessoas que preferem o gênero familiar: %3d", aposentados, menor, mediaIdade, aventura, familiar);
		
		
		
		
	}
}
