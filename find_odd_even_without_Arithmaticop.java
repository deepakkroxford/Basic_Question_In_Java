import java.util.Scanner;

public class find_odd_even_without_Arithmaticop {
    public static void main(String[] args) {
        /*
         * we have to find the the odd and even without using the
         * arithmatic operation. like +,-,%,/,*
         *  
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
         int n =sc.nextInt();
        int ans = n&1;
         if(ans==0)
         {
            System.out.println("even number");
         }
         else{
            System.out.println("odd number");
         }

    }
}
