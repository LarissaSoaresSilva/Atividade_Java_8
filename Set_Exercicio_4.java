package java_8;

import java.util.HashSet;
import java.util.Scanner;

public class Set_Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		HashSet<Integer> numeros = new HashSet<>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if (numeros.contains(numero)) {
			System.out.println("\nO número " + numero + " foi encontrado.");
		}else {
			System.out.println("\nO número " + numero + " não foi encontrado.");
		}
		
		ler.close();
	}

}
