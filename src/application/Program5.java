package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
			
		System.out.println("Digite os valores do vetor");
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			int k = i +1;
			sc.nextLine();
			System.out.println("Digite o nome do produto " + k + ": ");
			String name = sc.nextLine();
			System.out.println("Digite o valor do produto " + k + ": ");
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
			sum += vect[i].getPrice();
		}
		
		double average = sum/n;
		
		System.out.println("Lista de produtos e preços" + vect.getClass().getName());
		
		System.out.println("A média de preços é: " + average);
		
		
		sc.close();

	}

}
