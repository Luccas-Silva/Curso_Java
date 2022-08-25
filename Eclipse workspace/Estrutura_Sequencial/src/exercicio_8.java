import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, Respostas;
		
		System.out.println("		* Exerc�cio 06 *");
		System.out.println("");
		
		System.out.println(" Leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e\r\n"
				+ "mostre:\r\n"
				+ "a) A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.\r\n"
				+ "b) A �rea do c�rculo de raio C. (pi = 3.14159)\r\n"
				+ "c) A �rea do trap�zio que tem A e B por bases e C por altura.\r\n"
				+ "d) A �rea do quadrado que tem lado B.\r\n"
				+ "e) A �rea do ret�ngulo que tem lados A e B.");
		
		System.out.println("");
		System.out.println("");
		System.out.print("Digite um valor para a variavel A: ");
		A = sc.nextDouble();
		System.out.print("Digite um valor para a variavel B: ");
		B = sc.nextDouble();
		System.out.print("Digite um valor para a variavel C: ");
		C = sc.nextDouble();
		
		System.out.println("");
		
		Respostas = (A * C) / 2;
		System.out.printf("Resposta de A = %.2f %n" ,Respostas);
		
		Respostas = 3.14159 * (Math.pow(C, 2.0));
		System.out.printf("Resposta de B = %.2f %n" ,Respostas);
		
		Respostas = ((A + B) * C) / 2;
		System.out.printf("Resposta de C = %.2f %n" ,Respostas);
		
		Respostas = Math.pow(B, 2.0);
		System.out.printf("Resposta de D = %.2f %n" ,Respostas);
		
		Respostas = A * B;
		System.out.printf("Resposta de E = %.2f %n" ,Respostas);
		
		sc.close();

	}

}
