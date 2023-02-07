import java.util.Scanner;
public class Program_3 {

	public static void main(String[] args)
	{
		int n1, n2,n3;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1 = obj.nextInt();
		System.out.println("Enter second number: ");
		n2 = obj.nextInt();
		System.out.println("Enter third number: ");
		n3 = obj.nextInt();
		if(n1>n2 && n2>n3)
			System.out.println("Decreasing");
		else if(n1<n2 && n2<n3)
			System.out.println("Increasing");
		else
			System.out.println("Neither increasing nor decreasing");
	
			
		

	}

}
