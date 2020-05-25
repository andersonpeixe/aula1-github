package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double areax, areay;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areax = x.area();
		areay = y.area();

		System.out.printf("Área do Triângulo X: %.4f%n", areax);
		System.out.printf("Área do Triângulo Y: %.4f%n", areay);
		
		sc.close();
		
		if (areax > areay) {
			System.out.println("Área de X é maior");
		}
		else {
			System.out.println("Área de Y é maior");
		}
			

	}

}
