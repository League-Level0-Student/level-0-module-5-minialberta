package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String num=JOptionPane.showInputDialog("Type in a number");
	int num1=Integer.parseInt(num);
	for (int i = 0; i < num1 ; i++) {
		if (num1 % i==0) {
			JOptionPane.showMessageDialog(null, "This number is a prime number");
		}else {
			JOptionPane.showMessageDialog(null, "This number is not a prime number");
		}
	}
	
}
}
