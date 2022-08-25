import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("		* Exerc�cio 07 *");
		System.out.println("");
		
		System.out.println("Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.\r\n"
				+ "Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando\r\n"
				+ "essas informa��es conforme exemplo (use a palavra \"in\" para dentro do intervalo, e \"out\" para fora do intervalo).");
		System.out.println("");
		
		int numR, num, in=0, out=0;
		
		System.out.print("	Digite o n�mero de repeti��es: ");
		numR = sc.nextInt();
		System.out.println("");
		
		for (int i=0; i<numR; i++) {
			System.out.print("	Digite um n�mero: ");
			num = sc.nextInt();
			if(num >= 10 && num <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println("");
		System.out.println("	in: " +in);
		System.out.println("	out: "+out);
		
		sc.close();

	}

}
