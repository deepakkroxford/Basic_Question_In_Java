import java.util.Scanner;;
public class sum_integer
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n");
        int n = sc.nextInt();
        

        int sum=0;
        int rem;
          for(int i=n;i>0;i--) // while(n>0) or(for int i =0;i<=4;i++)
        {
             rem = n%10;
             /*
                this give me the reminder like first its 1234%10
                so its gives the reminder 4;
                then we add with sum so =0+4=4
                and the we divide the value of n by 10 =it gives the value 123
              */  
            sum=sum+rem;
             n=n/10;
        }
        System.out.println(sum);
    }
}