package _06_for_loop_gauntlet;

public class ForLoopGauntlet5 {
public static void main(String[] args) {
	int dinosaur=1;
	for (int i = 0; i < 500; i++) {
		System.out.println(dinosaur+" is odd");
		dinosaur=dinosaur+1;
				System.out.println(dinosaur+" is even");
				dinosaur=dinosaur+1;
	}
}
}
