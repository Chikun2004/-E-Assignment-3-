import java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter user number:");
           int num=sc.nextInt();
           int max=9;
           int min=1;
           int r=(int)(min+(max)*Math.random());
           if(num==r) {
        	   System.out.println("you got right");
           }else if(num-r<=1 || num-r==-1) {
        	   System.out.println("almost got it");
           }else {
        	   System.out.println("you got it wrong");
           }
               
           
              
               
        	       
           
          

           
           
            	
            
             
	}

}
