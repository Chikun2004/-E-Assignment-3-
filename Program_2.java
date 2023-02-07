import java.util.Scanner;
public class Program_2 {

	public static void main(String[] args) 
	{
		int x;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter millilitres of water Alice drank: ");
		x = obj.nextInt();
		if(x>=5000)
			System.out.println("Yes, Alice is following doctor's advice.");
		else
			System.out.println("No, Alice is not following doctor's advice");
		
	}

}
