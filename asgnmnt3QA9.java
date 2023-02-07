package Sibunsirpractice;
import java.util.Scanner;
public class asgnmnt3QA9 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=sc.nextInt();
        System.out.println("Enter second number:");
        b=sc.nextInt();
        System.out.println("Enter third number:");
        c=sc.nextInt();
        int MAX=Math.max((Math.max(a,b)),c);
        int MIN=Math.min((Math.min(a,b)),c);
        int s =(a+b+c)-(MAX+MIN);
        System.out.println("Largest Number:"+MAX);
        System.out.println("second Largest Number:"+s);
    }
}
