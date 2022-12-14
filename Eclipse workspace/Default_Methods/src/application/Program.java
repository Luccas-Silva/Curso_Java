package application;

import java.util.Scanner;

import model.service.InterestService;
import model.service.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService bs = new UsaInterestService(1.0);
		double payment = bs.payment(amount, months);
		
		System.out.println("Payment after " +months+ " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
