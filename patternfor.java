package iterativeStatment;

public class patternfor {

	public static void main(String[] args) {
		System.out.println("Normal Order");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Reverse order");
		System.out.println();
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
