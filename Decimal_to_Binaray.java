import java.util.Scanner;

public class Decimal_to_Binaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n = sc.nextInt();

        int ans=0;
        int palacevalue = 1;
        while (n>0) {
            int rem =n%2;
            ans= ans + rem * palacevalue;
            n=n/2;
            palacevalue=palacevalue*10;

        }
        System.out.println(ans);
    }
}
