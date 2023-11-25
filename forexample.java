package iterativeStatment;

public class forexample {

	public static void main(String[] args) {
		System.out.println("Ascending Order");
		for(int i=0;i<=5;i++)
		{
			
			System.out.println(i);
	}
		System.out.println("Descending Order");
		for(int i=5;i>=0;i--)
		{
			System.out.println(i);
	}
		
		//case 1
		System.out.println("Case 1");
		int i = 0;
		for(System.out.println("Are you Sleeping? ");i<=3;i++)
		{
			System.out.println("No");
	}
		
		//case 4
		System.out.println("Method one : Even Numbers");
		for( i=0;i<=10;i+=2)
		{
			System.out.println(i);
	}
		
		
		System.out.println("Method two : Even Numbers");
		for( i=0;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
	}
			}
		
		
		System.out.println("Method one : Odd Numbers");
		for( i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i);
	}
			}
		
		//Array of numbers using for loop
		System.out.println("Array of Numbers using for loop");
		int a[]= {1,2,3,4,5,6,7,8};
		for( i=0;i<a.length;i++)
		{	System.out.println(a[i]);
		}
		
		
		//case 2
				for( ; ;) {}
			// case 3
				
				/*
				 * Infinite Loop in case 3
				 * for(i=0;    ;i++)
				 * {
				 * System.out.println(i);
				 * }
				 */
					
}
}
