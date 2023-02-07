import java.util.Scanner;
public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ob=new Scanner(System.in);
       System.out.println("Enter three number:");
       int x =ob.nextInt();
       int y =ob.nextInt();
       int z =ob.nextInt();
       if((x<y) && (y<z))
       {
    	   System.out.println("Increasing");
    	   
       }else if(x>y && y>z) 
    	   System.out.println("decreasing");
       else {
    	   System.out.println("Neither increasing nor decreasing");
       }
       
    	   
       
	}

}
