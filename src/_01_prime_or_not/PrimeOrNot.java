package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String num=JOptionPane.showInputDialog("Type in a number");
	int num1=Integer.parseInt(num);
	boolean a=false;
	for (int i = 2; i < num1 ; i++) {
		if (num1 % i==0) {
			a=true;
		}
	}
	if(a==true) {
		JOptionPane.showMessageDialog(null, "This is not a prime number!");
				
	}else{
		JOptionPane.showMessageDialog(null, "This number is a prime number");
	}
	
}
}
