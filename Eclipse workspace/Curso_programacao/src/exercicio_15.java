import java.util.Locale;
import java.util.Scanner;

public class mianXV {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n1, n2, n3, n4, nf;
		
		System.out.println("Digite a nota do aluno(a): ");
		
		System.out.print("  1� Nota: ");
		n1 = sc.nextDouble();
		System.out.print("  2� Nota: ");
		n2 = sc.nextDouble();
		System.out.print("  3� Nota: ");
		n3 = sc.nextDouble();
		System.out.print("  4� Nota: ");
		n4 = sc.nextDouble();
		
		
		nf = (n1 + n2 + n3 + n4) / 4;
		
		if (nf > 6.0 ) {
			System.out.println(" # Aprovado # "); 
		}
		else {
			System.out.println(" # Reprovado #");
		}
		sc.close();

	}

}
