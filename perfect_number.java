import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int num = sc.nextInt();
        //the meaning of the perfect no is the factorial  sum of the 
        //given number is  equal to that number 
        /*
         * let take an example of number=6
         * so its factor is 1,2,3 so sum of the 
         * factor is 1+2+3=6 so this number is 
         * perfect number
         */
        int sum =0;
         for(int i =1;i<num;i++)
         {
            if(num%i==0)
            {
                sum = sum+i;
            }
         }
         if(sum==num)
         {
            System.out.println("the number is perfect");
         }
         else
         {
            System.out.println("the number is not perfect");
         }
    }
}
