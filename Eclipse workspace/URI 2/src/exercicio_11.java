import java.util.Scanner;

public class XI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Na;
		double n1, n2, n3, M;
		
		System.out.println("	     *  M�DIAS  *");
		System.out.println("");
		System.out.print(" Digite o numero de alunos avaliados: ");
		Na = sc.nextInt();
		
		for (int I = 1; I <= Na; I++) {
			System.out.println("");
			System.out.println("      Aluno numero " +I+ "�");
			System.out.print("   Digite a 1� nota: ");
			n1 = sc.nextDouble();
			System.out.print("   Digite a 2� nota: ");
			n2 = sc.nextDouble();
			System.out.print("   Digite a 3� nota: ");
			n3 = sc.nextDouble();
			System.out.println("");
			
			M = (n1 + n2 + n3)/3;
			
			System.out.printf(" * A m�dia e igual a %.1f. *%n ", M);
		}
		
		
		
		sc.close();

	}

}
