import java.util.Locale;
import java.util.Scanner;

public class MainVII {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int Z;
		double X, C;
		
		System.out.print("Dist�ncia total percorrida (em Km): ");
		Z = sc.nextInt();
		System.out.print("Total de combust�vel gasto: ");
		X = sc.nextDouble();
		C = Z / X;
		System.out.printf("consumo m�dio do autom�vel %.3f Km/l %n" ,C);
		
		sc.close();
	}

}
