package iterativeStatment;

public class patternwithspace {

	public static void main(String[] args) {
		System.out.println("Case 1");
		for(int i=1;i<=4;i++) {
			for(int j=0;j<=i;j++)
			{System.out.print(" ");
		}
			for(int k=4;k>=i;k--)
			{System.out.print("*");}
			System.out.println();
		}
		System.out.println();
		System.out.println("Case 2");
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--)
			{System.out.print(" ");
		}
			for(int k=1;k<=i;k++)
			{System.out.print("*");}
			System.out.println();
		}

	}
}
