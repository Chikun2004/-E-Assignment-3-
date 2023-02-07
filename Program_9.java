import java.util.Scanner;
public class Program_9 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = obj.nextInt();
		System.out.println("Enter second number: ");
		b = obj.nextInt();
		System.out.println("Enter third number: ");
		c = obj.nextInt();
		int max = Math.max((Math.max(a, b)),c);
		int min = Math.min((Math.min(a, b)),c);
		int s = (a + b+c)-(max+min);
		System.out.println("Largest Number: "+ max);
		System.out.println("Second largest number: "+ s);
		
		
		

	}

}
