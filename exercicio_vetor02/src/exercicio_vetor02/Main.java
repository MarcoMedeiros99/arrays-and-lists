package exercicio_vetor02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double somaAltura = 0.0;
        
        System.out.print("Quantas pessoas serao cadastradas? ");
        int qntPessoas = sc.nextInt();

        String[] vectNome = new String[qntPessoas];
        int[] vectIdade = new int[qntPessoas];
        Double[] vectAltura = new Double[qntPessoas];

        for (int i = 0; i < qntPessoas; i++) {
            System.out.println("\nDigite os dados da " + (i + 1) + "ª pessoa:");

            // limpa o buffer antes de ler nome
            sc.nextLine();

            System.out.print("Nome: ");
            vectNome[i] = sc.nextLine();

            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();

            System.out.print("Altura: ");
            vectAltura[i] = sc.nextDouble();
        }

        // soma das alturas
        for (int i = 0; i < qntPessoas; i++) {
            somaAltura += vectAltura[i];
        }

        double mediaAltura = somaAltura / qntPessoas;
        System.out.printf("%nAltura média: %.2f%n", mediaAltura);

        // contagem dos menores de 16 anos
        int contMenor16 = 0;
        for (int i = 0; i < qntPessoas; i++) {
            if (vectIdade[i] < 16) {
                contMenor16++;
            }
        }

        double porcentagem = (contMenor16 * 100.0) / qntPessoas;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        // mostra os nomes das pessoas com menos de 16
        for (int i = 0; i < qntPessoas; i++) {
            if (vectIdade[i] < 16) {
                System.out.println(vectNome[i]);
            }
        }

        sc.close();
    }
}
