package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		System.out.println("Digite os valores do vetor");
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o termo " + i+1);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double average = sum/n;
		
		System.out.println("A média é: " + average);
		
		
		sc.close();

	}

}
