import java.util.Scanner;
public class Program_1 
{

	public static void main(String[] args) 
	{
		int age;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter age: ");
		age = obj.nextInt();
		
		if(age>=18)
			System.out.println("You are eigible to cast your vote");
	}

}
