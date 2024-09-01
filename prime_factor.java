import java.util.Scanner;
public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for finding the prime factor");
        int n = sc.nextInt();

        System.out.println("the prime factor of the number is ");
        for(int i =2;i<=n;i++)
        {
            while(n%i==0)
            {
                n=n/i;
                System.out.println(i);
            }
        }
    }
}
