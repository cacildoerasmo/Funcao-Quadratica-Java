package FunQuadratica;

import java.util.Scanner;

public class EsTR1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		double delta;
		double x1;
		double x2;
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de b: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de c: ");
		c = sc.nextDouble();
		
		if(a != 0) {
			
			delta = (b*b) - (4*a*c);
				
			if(delta >= 0) {
				
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				
				System.out.println("O valor do delta: "+delta);
				System.out.println("Raiz 1: "+x1);
				System.out.println("Raiz 2: "+x2);
				
			}else {
				
				System.out.println("A equação não tem raizes! Pois não existe raiz quadrada de um número negativo.");
	
			}
			
		}else {
			System.out.println("Não é uma equação quadrática.");
		}
		
	}

}
