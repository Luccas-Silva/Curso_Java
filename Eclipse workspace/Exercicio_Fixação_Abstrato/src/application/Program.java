package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <TaxPayers> list = new ArrayList <>();
		
		System.out.print("Enter the number of tax payers: ");
		int numPayers = sc.nextInt();
		
		for (int i=1; i <= numPayers; i++) {
			System.out.println();
			System.out.println("Tax payer #" +i+ " data:");
			System.out.print(" Individual or company (i/c)? ");
			char ind_com = sc.next().charAt(0);
			System.out.print(" Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print(" Anual income: ");
			double anualIncome =  sc.nextDouble();
			if(ind_com == 'i') {
				System.out.print(" Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual (name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print(" Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company (name, anualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.00;
		for(TaxPayers tp : list) {
			double tax = tp.tax();
			System.out.println(" "+ tp.getName() +": $ "+ String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: ");
		System.out.println("  $ " + String.format("%.2f", sum));
		
		sc.close();

	}

}
