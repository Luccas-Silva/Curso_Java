import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, y;
		
		System.out.println("	* Exerc�cio 03 *");
		System.out.println("");
		
		System.out.print("Digite um n�mero para largura: ");
		x = sc.nextInt();
		System.out.print("Digite um n�mero para altura: ");
		y = sc.nextInt();
		
		while(x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("	1� Quadrante ");
			}
			else if(x < 0 && y > 0) {
				System.out.println(" 	2� Quadrante ");
			}
			else if (x > 0 && y < 0){
				System.out.println(" 	4� Quadrante ");
			}
			else {
				System.out.println(" 	3� Quadrante ");
			}
			
			System.out.println("");
			System.out.print("Digite um n�mero para largura: ");
			x = sc.nextInt();
			System.out.print("Digite um n�mero para altura: ");
			y = sc.nextInt();
			
		}
		
		System.out.println("* Uma das coordenadas e NULA *");
		
		
		sc.close();

	}

}
