import java.util.Scanner;

public class Set_bit_Rsb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        
        /*
         * int n =5 101
         * rmsb = 1
         * for finding the right mostsignificant bit we have to find 2s complement of n
         *  one complement of n - 010
         *   2 complemnt of n   -  +1
         *                        011 
         * AND perform the and operation with the given n
         *  101 
         *  011
         *  ----
         *  001 output done
         * 
         */

       //-n means 2s complement

        int rmsb = n & -n;
        System.out.println(Integer.toBinaryString(rmsb));
    }
}
