package exercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("--exercicio Switch--\n1-calculo natalidade/mortalidade.\n2-calculo produto.\nSua escolha: ");
		int op = scanner.nextInt();
		switch (op) {
		case 1:
			System.out.println("--Teste de natalidade/mortalidade--\n1-Natalidade.\n2-Mortalidade.\nSua escolha: ");
			op = scanner.nextInt();
			int numHabitantes;
			switch (op) {
			case 1:
				System.out.println("Numero de crianças nascidas: ");
				int numCriancas = scanner.nextInt();
				System.out.println("Numero de Habitantes: ");
				numHabitantes = scanner.nextInt();
				int natalidade = (numCriancas * 1000) / numHabitantes;
				System.out.println("A taxa de  natalidade é: " + natalidade);
				break;
			case 2:
				System.out.println("Numero de Obitos: ");
				int numObitos = scanner.nextInt();
				System.out.println("Numero de Habitantes: ");
				numHabitantes = scanner.nextInt();
				int mortalidade = (numObitos * 1000) / numHabitantes;
				System.out.println("A taxa de  mortalidade é: " + mortalidade);
				break;
			default:
				break;
			}
			break;
		case 2:
			System.out.println("--Calculo produto--\n1-A vista.\n2-à prazo(30 dias).\n3-à prazo parcelado\nSua escolha: ");
			op = scanner.nextInt();
			System.out.println("Preço do produto: ");
			double preco = scanner.nextDouble();
			switch (op) {
			case 1:
				System.out.println("Valor total: "+preco * 0.9);
				break;
			case 2:
				System.out.println("Valor total: "+preco * 1.03);
				break;
			case 3:
				System.out.println("Deseja pagar em quantas vezes: ");
				int numParcelas = scanner.nextInt();
				System.out.println("Valor total: "+( preco + ( preco * 0.015 ) * numParcelas ));
				break;
			default:
				break;
			}

			break;

		default:
			break;
		}
		scanner.close();
	}

}
