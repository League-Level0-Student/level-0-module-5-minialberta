package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGauntlet7 {
public static void main(String[] args) {
	int dinosaur=2004;
	int stupid=0;
	for (int i = 0; i < 15; i++) {
		JOptionPane.showMessageDialog(null, "In "+dinosaur+" I was "+stupid+" years old");
		dinosaur=dinosaur+1;
				stupid=stupid+1;
	}
}
}
