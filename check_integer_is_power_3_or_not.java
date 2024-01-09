public class check_integer_is_power_3_or_not {
    public static void main(String[] args) {

        /*
         * Given a positive integer N, write a function to find if it is a power of
         * three or not.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input:
         * N = 3
         * Output:
         * Yes
         * Explanation:
         * 31 is a power of 3.
         * 
         * 
         * Example 2:
         * 
         * Input:
         * N = 5
         * Output:
         * No
         * Explanation:
         * 5 is not a power of 3.
         */
        
        class Solution {
            static String isPowerof3(int N) {
                // code here
                for (int i = 0; i < 100; i++) {
                    if (N == Math.pow(3, i)) {
                        return "Yes";
                    }
                }
                return "No";
            }
        }
    }
}
