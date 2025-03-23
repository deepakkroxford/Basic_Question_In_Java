import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the binary number");
       int n = sc.nextInt();
       int ans =0;
       int i =0;
       while(n!=0)
       {
        int rem = n%10;
        ans +=rem * (int)Math.pow(2,i++);
        n=n/10;
       }
       System.out.println(ans);
    }
}
