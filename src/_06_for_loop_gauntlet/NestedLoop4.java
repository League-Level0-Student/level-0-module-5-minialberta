package _06_for_loop_gauntlet;

public class NestedLoop4 {
public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
		for (int j = 0; j < 4; j++) {
		
if (j==1) {
	System.out.println("*");
}else if(j==2) {
	System.out.println("* *");
		}else if(j==3) {
			System.out.println("* * *");
		}else { 
			System.out.println(("* * * *"));
		}
	}
}}}

