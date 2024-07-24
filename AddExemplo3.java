package Aula_24_07;

import java.util.ArrayList;

public class AddExemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros  = new ArrayList<>();

		numeros.add(10);
		numeros.add(20);


		//adicionando um valor
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		//adicionado um valor

		numeros.set(1,  25);
		System.out.println(numeros.get(1));

		numeros.remove(0);
		System.out.println(numeros.get(0));
		System.out.println(numeros.size());


	}

}
