import java.util.Scanner;
public class Program_6 
{

	public static void main(String[] args) 
	{
	  int unit;
	  double bill=0.0;
	  Scanner obj = new Scanner(System.in);
	  System.out.println("Enter number of units: ");
	  unit = obj.nextInt();
	  if(unit<=50)
		  bill = 3*unit;
	  else if(unit>50 && unit<=200)
		  bill = 50*3+ (unit-50)*4.80;
	  else if(unit>200 && unit<=400)
		  bill = 50*3+ 150*4.80+ (unit-200)*5.80;
	  else if(unit>400)
		  bill = 50*3 + 150*4.80 + 200*5.80 + (unit-400)*6.20;
	  System.out.println("Bill: "+ bill);
	}

}
