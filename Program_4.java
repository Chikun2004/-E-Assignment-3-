import java.util.Scanner;
public class Program_4 {

	public static void main(String[] args) 
	{
		int a;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter user number between ");
		a = obj.nextInt();
		int b = 1 + (int)((9-1)*Math.random());
		System.out.println("Computer guesses: "+ b);
		if (a == b)
			System.out.println("You got it right");
		else if((a-b)==1 || (b-a)==1)
			System.out.println("You almost got it right");
		else
			System.out.println("You got it wrong");
		
			
		
	}

}
