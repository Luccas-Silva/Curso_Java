import java.util.Scanner;

public class MainXX {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int X, Y;
		double T = 0;
		
		System.out.println("------------------------------------");
		System.out.println(" |CODIGO|    |LANCHES|       |PRE�O|");
		System.out.println("------------------------------------");
		System.out.println("  1�     Cachorro-quente.....R$ 4.00");
		System.out.println("  2�     X-Salada............R$ 4.50");
		System.out.println("  3�     X-Bacon.............R$ 5.00");
		System.out.println("  4�     Torrada.............R$ 2.00");
		System.out.println("  5�     Refri...............R$ 1.50");
		System.out.println("------------------------------------");
		
		System.out.print("Digite um Pedido: ");
		X = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		Y = sc.nextInt();
		
		if (X == 1) {
			T = (Y * 4.00);
		}
		else {
			if (X == 2) {
				T = (Y * 4.50);
			}
			else {
				if (X == 3) {
					T = (Y * 5.00);
				}
				else {
					if (X == 4) {
						T = (Y * 2.00);
					}
					else {
						if (X == 5) {
							 T = (Y *  1.50);
						}
					}
				}
			}
		}
		
		System.out.printf("Total: R$ %.2f %n", T);
		
		sc.close();
	}

}
