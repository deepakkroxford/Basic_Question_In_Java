import java.util.Scanner;

/**
 * set_bit_position
 */
public class set_bit_Findposition {

    public static void main(String[] args) {
        /*

         * Given a number N having only one ‘1’ and all other ’0’s in its binary
         * representation, find position of the only set bit. If there are 0 or more
         * than 1 set bit the answer should be -1. Position of set bit '1' should be
         * counted starting with 1 from LSB side in binary representation of the number.
         * 
         * Example 1:
         * 
         * Input:
         * N = 2
         * Output:
         * 2
         * Explanation:
         * 2 is represented as "10" in Binary.
         * As we see there's only one set bit
         * and it's in Position 2 and thus the
         * Output 2.
         * Example 2:
         * 
         * Input:
         * N = 5
         * Output:
         * -1
         * Explanation:
         * 5 is represented as "101" in Binary.
         * As we see there's two set bits
         * and thus the Output -1.
         * 
         * so meaning of this question is if the binaray number conatain only one '1' and any number 
         * of '0' so we have to print the position of that bit 1000 = pos(4) ,1000000= pos(7)
         * if it contain more than 1 number of '1' like 101100 so we have to print -1;
         * if it contain zero number of 1 then we have to print the -1;
         */

         //formula for finding the positon is log2(n)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
         int n=sc.nextInt();
         if(n==0)
         {
            System.out.println(-1);
         }
         if((n&n-1)==0)
         {
            System.out.println("the positon of set bit is "+Math.log(n)+1);
         }
         else{
            System.out.println(-1);
         }
         sc.close();
    }
}