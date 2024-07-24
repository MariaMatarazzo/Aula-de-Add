package Aula_24_07;

import java.util.ArrayList;
import java.util.Random;

public class AddNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int mult;
		ArrayList<Integer> numeros  = new ArrayList<>();
		Random random= new Random();

		for (int i=0; i<10; i++) {
			int numerosAleatorios = random.nextInt(10);
			numeros.add(numerosAleatorios);
		}

		for(int i: numeros) {
			System.out.println("O numero x 2 é: "+i*2);

		}


	}

}


