import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 11.3647547;
		
		System.out.println("Olá Mundo");
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println("Resultado é: " + x + " correto?");
		
		String nome = "Anderson";
		int idade = 37;
		double renda = 5000.00;
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
		
		int x1, y1;
		x1 = 5;
		y1 = 2 * x1;
		System.out.println(x1);
		System.out.println(y1);
		
		Scanner sc = new Scanner(System.in);
		String xw;
		System.out.println("Digite:");
		xw = sc.next();
		System.out.println("Você digitou " + xw);
		sc.close();
		
	}

}
