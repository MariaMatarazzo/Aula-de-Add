package Aula_24_07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class AddExemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i=0; i<5; i++);{
		int numerosAleatorios = random.nextInt(100);
		numeros.add(numerosAleatorios);
	}
	for (int numero :numeros) {
		System.out.println(numero);
	}
		
		

	}

}
