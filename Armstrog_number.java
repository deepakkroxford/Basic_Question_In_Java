import java.util.Scanner;

public class Armstrog_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * For a given 3 digit number, find whether it is armstrong number or not. An
         * Armstrong number of three digits is an integer such that the sum of the cubes
         * of its digits is equal to the number itself. Return "Yes" if it is a
         * armstrong number else return "No".
         * NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
         */
        System.out.println("enter the vlaue of n");
        int n= sc.nextInt();
        int temp =n;
        int rev=0;
        while(n>0)
        {
            int rem = n%10;
            rev = rev +(rem*rem*rem);
            n= n/10;
        }
        if(rev==temp)
        {
            System.out.println("it is an armstrong number");
        }
        else
        {
            System.out.println("no is not armstrong");
        }
        sc.close();
        
    }
}
