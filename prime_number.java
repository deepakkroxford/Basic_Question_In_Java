import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no ");
        int num =sc.nextInt();
        int count=0;
        if(num==0||num==1)
        {
            System.out.println("the number is not prime"+num);
        }

        /*
         * First approach time complexity O(N);
         */
        if(num>1)
        {
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                count++;
            }
                if(count==2)
                {
                    System.out.println("the number is prime"+num);
                }
                else
                {
                    System.out.println("the number is  not prime"+num);
                }
        }


        //2nd approach
      


    }
}
