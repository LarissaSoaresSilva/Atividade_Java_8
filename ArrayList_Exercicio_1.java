package java_8;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList_Exercicio_1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor " + (i + 1) + ": ");
			String cor = ler.nextLine();
			cores.add(cor);
		}
		System.out.println("Todas as cores: \n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		cores.sort(null);
		
		System.out.println("\nCores ordenadas: \n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		ler.close();
	}
}