import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x, y, z;

		System.out.println("	* Exerc�cio 01 *");
		System.out.println("");

		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		System.out.print("Digite um outro numero: ");
		y = sc.nextInt();

		z = x + y;
		System.out.println("");
		System.out.println("A adi��o de " + x + " + " + y + " = " + z);

		z = x - y;
		System.out.println("");
		System.out.println("A subtra��o de " + x + " - " + y + " = " + z);

		z = x * y;
		System.out.println("");
		System.out.println("A Multiplica��o de " + x + " * " + y + " = " + z);

		z = x / y;
		System.out.println("");
		System.out.println("A divis�o de " + x + " / " + y + " = " + z);

		sc.close();

	}

}
