package SelectionStatments;

public class twointswitch {

	public static void main(String[] args) {
		int x=10;
		final int y=20;
		switch(x)
		{
		case 10:
			System.out.println("Hello");
		
			
		/* Without final keyword,it will throw an error
		 * case y:
			System.out.println("Hi");
			break;	
			*/
		case y:
			System.out.println("Hi");
			break;
		}

	}

}
