import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num;
		
		System.out.println("		* Exerc�cio 01 *");
		System.out.println("");
		
		System.out.print("	Digite um numero: ");
		num = sc.nextInt();
		
		System.out.println("");
		if (num < 0) {
			System.out.println("	* " +num+ " � um n�mero negativo *");
		}
		else if (num > 0){
			System.out.println("	* "+num+ " � um n�mero positivo *");
		}
		else {
			System.out.println("	* O zero n�o � um n�mero positivo nem  ");
			System.out.println("	 negativo, j� que n�o � maior nem menor que si mesmo. *");
		}
		
		sc.close();

	}

}
