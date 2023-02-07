package Sibunsirpractice;
import java.util.Scanner;
public class asgnmnt3QA10 {
    public static void main(String[] args) {
        int marks;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter marks of Student:");
        marks=obj.nextInt();
        switch (((int)marks/10))
        {
            case 10:
            case 9:  System.out.println("Grade:O");break;
            case 8:  System.out.println("Grade:A");break;
            case 7:  System.out.println("Grade:B");break;
            case 6:  System.out.println("Grade:C");break;
            case 5:  System.out.println("Grade:D");break;
            case 4:  System.out.println("Grade:E");break;
            default: System.out.println("Grade:F");break;

        }


        }
    }

