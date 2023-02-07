package Sibunsirpractice;
import java.util.Scanner;
public class asgnmnt3QA7 {
    public static void main(String[] args) {
        int units;
        double bill=0.0;
        char c;
        double discount=0.0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of units:");
        units=obj.nextInt();
        System.out.println("Do you want to pay online (y/n):");
        c=obj.next().charAt(0);
        if(units>0 && units<=50){
            bill=3*units;
        }else if(units>50 && units<=200){
            bill=50*3+(units-50)*4.80;
        }else if(units>200 && units<=400){
            bill=50*3+150*4.80+(units-200)*5.80;
        }else if(units>400){
            bill=50*3+150*4.80+200*5.80+(units-400)*6.20;
        }
        if(c=='y'){
            discount=0.03*bill;
            bill=bill-discount;
        }
        System.out.println("Discount:"+discount);
        System.out.println("Amount Payable:"+bill);


    }

}

