
import java.util.Scanner;
public class Palindrome_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp=n;
        int rem;
        int rev=0;
        while(n>0)
        {
            rem = n%10;
            rev = (rev*10)+rem;
            n=n/10;
        }
        System.out.println("after reversing"+rev);

        if(temp==rev)
        {
            System.out.println("the is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
    }
}
