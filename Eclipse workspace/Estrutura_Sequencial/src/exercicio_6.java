import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num, horas;
		double valHoras, sal;
		
		System.out.println("	* Exerc�cio 04 *");
		System.out.println("");
		
		System.out.print("Leitor de n�mero de funcion�rio: ");
		num = sc.nextInt();
		
		System.out.print("Seu n�mero de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.print("Valor que recebe por hora: ");
		valHoras = sc.nextDouble();
		
		sal = (double) valHoras * horas;
		
		System.out.println("");
		System.out.println("Valor do sal�rio do funcion�rio n�mero " +num);
		System.out.printf("	Sal�rio = %.2f %n" ,sal);
		
		sc.close();
	}

}
