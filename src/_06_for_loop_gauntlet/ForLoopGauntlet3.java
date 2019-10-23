package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGauntlet3 {
public static void main(String[] args) {
	
	int dinosaur=2;
	for (int i = 0; i < 50; i++) {
		
	JOptionPane.showMessageDialog(null, dinosaur);
	dinosaur=dinosaur+2;
	}
}
}
