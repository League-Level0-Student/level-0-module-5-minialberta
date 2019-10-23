package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
public static void main(String[] args) {
	int dinosaur=1;
	for (int i = 0; i < 100; i++) {
		JOptionPane.showMessageDialog(null, dinosaur);
		dinosaur=dinosaur+1;
	}
}
}
