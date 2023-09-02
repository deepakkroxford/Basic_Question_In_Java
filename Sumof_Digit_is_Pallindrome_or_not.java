import java.util.Scanner;

public class Sumof_Digit_is_Pallindrome_or_not {
    public static void main(String[] args) {
        /*
         * Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome
         * number or not.
         * Note:A Palindrome number is a number which stays the same when
         * reversed.Example- 121,131,7 etc.
         * 
         * N=56
         * Output:
         * 1
         * Explanation:
         * The digit sum of 56 is 5+6=11.
         * Since, 11 is a palindrome number.Thus,
         * answer is 1.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int N = sc.nextInt();

        int sum = 0;
        while (N > 0) {
            int rem = N % 10;
            sum = sum + rem;
            N = N / 10;

        }
        int ans = sum;
        int rev = 0;
        while (sum > 0) {
            int rem = sum % 10;
            rev = (rev * 10) + rem;
            sum = sum / 10;
        }
        if (rev == ans) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
