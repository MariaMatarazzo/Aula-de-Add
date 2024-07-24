package Aula_24_07;
import java.util.ArrayList;
import java.util.Arrays;
public class AddExemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] disciplinas={"matematica","filosofia","historia","fisica"};
		ArrayList<String> novaLista= new ArrayList<String>(Arrays.asList(disciplinas));
		
		novaLista.add("Geografia");
		novaLista.add("Lingua Portuguesa");
		
		for (String i : novaLista)
		{
			System.out.println ("Disciplina: " + i);
		}
		
		

	}

}
