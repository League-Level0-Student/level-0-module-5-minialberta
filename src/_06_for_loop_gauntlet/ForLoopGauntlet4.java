package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGauntlet4 {
public static void main(String[] args) {
	
int migos=1;
for (int i = 0; i < 50; i++) {
	JOptionPane.showMessageDialog(null, migos);
	migos=migos+2;
}
}
}