import java.util.Scanner;
public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the year");
        int year=sc.nextInt();
        if(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0)) {
        	System.out.println("Leap year");
        }else {
        	System.out.println("Wrong");
        }
        
	}

}
