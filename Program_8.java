import java.util.Scanner;
public class Program_8 {

	public static void main(String[] args)
	{
		double x,y;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter x co-ordinate: ");
		x=obj.nextDouble();
		System.out.println("Enter y co-ordinate:");
		y=obj.nextDouble();
		if(x==0)
			System.out.println("("+ x + ","+ y+")"+ "lies on y-axis");
		else if(y==0)
			System.out.println("("+ x + ","+ y+")"+ "lies on x-axis");
		else if(x>0 && y>0)
			System.out.println("("+ x + ","+ y+")"+ "lies in Quadrant I");
		else if(x<0 && y>0)
			System.out.println("("+ x + ","+ y+")"+ "lies in Quadrant II");
		else if(x<0 && y<0)
			System.out.println("("+ x + ","+ y+")"+ "lies in Quadrant III");
		else
			System.out.println("("+ x + ","+ y+")"+ "lies in Quadrant IV");
			
		
			
			
	}

}
