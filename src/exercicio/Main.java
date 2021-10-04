package exercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--Teste de natalidade/mortalidade--\n1-Natalidade.\n2-Mortalidade.\nSua escolha: ");
		int op = scanner.nextInt();
		int numHabitantes;
		switch (op) {
		case 1:
			System.out.println("Numero de crianças nascidas: ");
			int numCriancas = scanner.nextInt();
			System.out.println("Numero de Habitantes: ");
			numHabitantes = scanner.nextInt();
			int natalidade = ( numCriancas * 1000 ) / numHabitantes;
			System.out.println("A taxa de  natalidade é: "+ natalidade);
			break;
		case 2:
			System.out.println("Numero de Obitos: ");
			int numObitos = scanner.nextInt();
			System.out.println("Numero de Habitantes: ");
			numHabitantes = scanner.nextInt();
			int mortalidade = ( numObitos * 1000 ) / numHabitantes;
			System.out.println("A taxa de  mortalidade é: "+ mortalidade);
			break;
		default:
			break;
		}
		scanner.close();
	}

}
