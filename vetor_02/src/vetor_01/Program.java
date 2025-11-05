package vetor_01;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos produtos você vai digitar? ");
		int n = sc.nextInt();

		Product[] vect = new Product[n];
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite os dados do produto " + (i + 1) + "º:");
			System.out.print("Nome: ");
			sc.nextLine(); // consome quebra de linha
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.println();
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();

	}

}
