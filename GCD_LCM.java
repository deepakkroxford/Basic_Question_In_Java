import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no first");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2 =sc.nextInt();

        int realn1 = n1;
        int realn2 = n2;

        // while(n1%n2!=0)
        // {
        //     int rem = n1%n2;
        //     n1=n2;
        //     n2=rem;

        // }
        // int gcd =n2;
        // int lcm =(realn1*realn2)/gcd;
        // System.out.println("the gcd of given number is "+gcd);
        // System.out.println("the lcm of the given number is "+lcm);

        //another way to find the gcd;
        while(realn1!=realn2)
        {
            if(realn1==0)
            {
                System.out.println("gcd"+realn1);
            }
            if(realn1>realn2)
            {
                realn1=realn1-realn2;
            }
            if(realn2>realn1)
            {
                realn2=realn2-realn1;
            }
        }
        System.out.println(realn1);
    
    }
    
}
