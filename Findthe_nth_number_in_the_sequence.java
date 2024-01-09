public class Findthe_nth_number_in_the_sequence {
    public static void main(String[] args) {
        /*
         * Consider the sequence of numbers 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5,
         * ... In this sequence first we have the number 1, then the numbers from 1 to
         * 2, then the numbers from 1 to 3 and so on. Your task is to find the N'th
         * number in this sequence.
         * 
         * 
         * Example 1:
         * 
         * Input: N = 4
         * Output: 1
         * Explanation: 4'th number is 1.
         * â€‹Example 2:
         * 
         * Input: N = 14
         * Output: 4
         * Explanation: 14'th number is 4.
         */

         class Solution{
            static long get(long n){
                //complete the function here
                // long arr[] = new long [n];
                for(long i=1;i<n;i++)
                {
                    n=n-i;
                }
                return n ;
            }
        }
    }
}
