package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual � o pre�o do d�lar? ");
		double valorDolar = sc.nextDouble();
		
		System.out.print("Quantos d�lares ser�o comprados? ");
		double dolaresComprados = sc.nextDouble();
		
		double resultado = CurrencyConverter.ValorAPagar(valorDolar, dolaresComprados);
		System.out.printf("Valor a ser pago em reais : %.2f %n",resultado);
				
		
		sc.close();

	}

}
