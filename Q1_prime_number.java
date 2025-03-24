import java.util.Scanner;

public class Q1_prime_number {

    public static boolean isPrimeI(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeII(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int  n = sc.nextInt();

        System.out.println(isPrimeI(n));
        sc.close(); 
         


    }
}
