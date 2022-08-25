package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("");
		System.out.println("		* Produtos *");
		System.out.println("");
		
		int n;
		
		System.out.print("Digite o n�mero de quantos produtos diferentes ser�o digitados: ");
		n = sc.nextInt();
		
		Product [] vet = new Product [n];
		
		System.out.println("");
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do " +(i+1)+ "� produto: ");
			String nome = sc.nextLine();
			System.out.print("Digite o Pre�o do " +(i+1)+ "� produto: ");
			double preco = sc.nextDouble();
			vet [i] = new Product(nome, preco);
			System.out.println("");
		}
		
		double media = 0.0;
		for (int i=0; i<n;i++) {
			media += vet[i].getPreco();
		}
		
		media = media / n;
		
		System.out.printf("M�dia dos pre�o de todos os produtos: %.2f %n", media);
		
		sc.close();

	}

}
