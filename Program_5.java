import java.util.Scanner;
public class Program_5 {

	public static void main(String[] args) 
	{
		int year;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter year: ");
		year = obj.nextInt();
		if(((year%4==0)&&(year%100!=0))|| (year%400==0))
				System.out.println("It is a leap year");
		else 
			System.out.println("It is not a leap year");
			

	}

}
