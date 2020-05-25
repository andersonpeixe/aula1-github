package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

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
		
		double p = (x.a + x.b + x.c) / 2.0;
		
		areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("�rea do Tri�ngulo X: %.4f%n", areax);
		System.out.printf("�rea do Tri�ngulo Y: %.4f%n", areay);
		
		sc.close();
		
		if (areax > areay) {
			System.out.println("�rea de X � maior");
		}
		else {
			System.out.println("�rea de Y � maior");
		}
			

	}

}
