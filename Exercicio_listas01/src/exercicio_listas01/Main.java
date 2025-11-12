package exercicio_listas01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios serão cadastrados: ");
		int qntFuncinarios = sc.nextInt();

		List<Funcionarios> lista = new ArrayList<>();

		for (int i = 0; i < qntFuncinarios; i++) {

			System.out.println("Digite o id do " + (i + 1) + "º funcionario: ");
			int id = sc.nextInt();
			sc.nextLine(); // limpa o enter pendente
			System.out.println("Digite o nome do " + (i + 1) + "º funcionario: ");
			String nome = sc.nextLine();
			System.out.println("Digite o salario do " + (i + 1) + "º funcionario: ");
			Double salario = sc.nextDouble();

			Funcionarios func = new Funcionarios(id, nome, salario);

			lista.add(func);
		}

		System.out.println("digite o id do funcionario que vair ganhar o aumento: ");
		int idUp = sc.nextInt();
		sc.nextLine(); // limpa o enter pendente

		boolean achou = false;

		for (int i = 0; i < qntFuncinarios; i++) {
			if (lista.get(i).getId() == idUp) {
				achou = true;
				System.out.println("digite a porcentagem de aumento: ");
				int aumento = sc.nextInt();
				sc.nextLine(); // limpa o enter pendente
				lista.get(i).upSalario(aumento);
				break; // não precisa continuar procurando
			}
		}
		
		if (!achou) { // se não achou nenhum id igual
			System.out.println("Funcionario nao encontrado");
		}
		
		System.out.println();
		System.out.println("Lista de funcionários atualizada:");
		for (int i = 0; i < lista.size(); i++) {
		    System.out.println("ID: " + lista.get(i).getId() 
		        + ", Nome: " + lista.get(i).getName() 
		        + ", Salário: " + lista.get(i).getSalario());
		}

		sc.close();
	}

}
