import java.util.Scanner;

public class oneS_complement {
    public static void main(String[] args) {
        /*
         * Given an integer N, write a program to find the one’s complement of the
         * integer.
         * 
         * 
         * Example 1:
         * 
         * Input:
         * N = 5
         * Output:
         * 2
         * Explanation:
         * binary of 5 is 101
         * 1's complement of 101 is 010
         * 010 is 2 in its decimal form.
         * Example 2:
         * 
         * Input:
         * N = 255
         * Output:
         * 0
         * Explanation:
         * binary of 255 is 1111 1111
         * 1's complement of 1111 1111 is
         * 0000 0000 which is 0 in its decimal form.
         * 
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number n");
         int n = sc.nextInt();

         int m = n;
         int bitmask =0;
         while(m !=0)
         {
            bitmask = (bitmask<<1)|1;  
            m=m>>1;
         }

         /*
          * how this while loop generate the 1
          so we inisilise bitmask =0; so in binary form is like 0000000000
          conditon of while m!=0; initialyy m = 5
          we are doing bitmask leftshift by 1 and doing OR operation with 1;
          till m!=0;
          so 000000001
          m =4 becuse we are doing right shift on m so m =101 now its 10;
          so again 00000011 m= 1;
          so again 00000111 m =0;
          loop will break
           and we get our 111 as in bit mask




          */
         int ans = bitmask^n;
         //doing XOR operation with n
         //and we get our output.
         System.out.println(ans);
    }
}
