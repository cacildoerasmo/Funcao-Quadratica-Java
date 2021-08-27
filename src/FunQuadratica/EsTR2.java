package FunQuadratica;

import javax.swing.JOptionPane;

public class EsTR2 {
	

	public static void main(String[] args) {
	
		double a,b,c;
		double delta;
		double x1;
		double x2;
		String aux;
		
		aux = JOptionPane.showInputDialog("Digite o valor de a: ");
		a = Double.parseDouble(aux);
		
		aux = JOptionPane.showInputDialog("Digite o valor de b: ");
		b = Double.parseDouble(aux);
		
		aux = JOptionPane.showInputDialog("Digite o valor de c: ");
		c = Double.parseDouble(aux);
		
		if(a != 0) {
			
			delta = (b*b) - (4*a*c);
			
			if(delta >= 0) {
				
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				
				JOptionPane.showMessageDialog(null, "O valor do delta: "+delta);
				JOptionPane.showMessageDialog(null, "X1 = "+x1+" & "+"X2 = "+x2);
				
			}else {
				JOptionPane.showMessageDialog(null, "A equacao nao tem raizes! Pois nao existe raiz quadrada de um numero negativo.");
			}
			
			}else {
				JOptionPane.showMessageDialog(null, "Nao eh uma equacao quadratica.");
			}
		
		

	}

}
