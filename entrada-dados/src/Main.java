import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// Exemplo 1 - Imprimindo uma String
		// Scanner sc = new Scanner(System.in);

		// String x;
		// x = sc.next();
		// System.out.println("Você digitou: " + x); // Digite sysout e pressione logo
		// em seguida 'Ctrl' + 'espaço'

		// sc.close();

// Exemplo 2 - Imprimindo um Inteiro
		// Scanner sc = new Scanner(System.in);

		// int x;
		// x = sc.nextInt();
		// System.out.println("Você digitou: " + x);

		// sc.close();

// Exemplo 3 - Imprimindo um Double
		// Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

		// double x;
		// x = sc.nextDouble();
		// System.out.println("Você digitou: " + x); // apresenta o resultado com o
		// ponto
		// System.out.printf("Você digitou: %.2f%n", x); // apresenta o resultado com a
		// vírgula

		// sc.close();

// Exemplo 4 - Imprimindo um char
		// Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

		// char x;
		// x = sc.next().charAt(0);
		// System.out.println("Você digitou: " + x);

		// sc.close();

// Exemplo 5 - Imprimindo vários dados na msm linha
		// Locale.setDefault(Locale.US);
		// Scanner sc = new Scanner(System.in);

		// String x;
		// int y;
		// double z;

		// x = sc.next();
		// y = sc.nextInt();
		// z = sc.nextDouble();

		// System.out.println("Dados digitados:");
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(z);

		// sc.close();

// Exemplo 6 - Ler um atexto até a QUEBRA DE LINHA. OBS: Ctrl + shift + f p/ fazer a identação.
		//Scanner sc = new Scanner(System.in);

		//String s1, s2, s3;

		//s1 = sc.nextLine();
		//s2 = sc.nextLine();
		//s3 = sc.nextLine();
		
		//System.out.println("DADOS DIGITADOS: ");
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		
// Exemplo 7
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // OBS: Com a ausência desta linha, ao pressionar Enter, fica um vazio.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
