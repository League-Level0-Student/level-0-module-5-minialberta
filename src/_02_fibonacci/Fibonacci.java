package _02_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
	int numero=0;
	int numero1=1;
	
	for (int i = 0; i < 4; i++) {
		int numero2=numero+numero1;
		JOptionPane.showMessageDialog(null, numero2);
	 numero=numero1+numero2;
	 JOptionPane.showMessageDialog(null, numero);
	numero1=numero2+numero;
			JOptionPane.showMessageDialog(null, numero1);;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
