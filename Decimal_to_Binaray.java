import java.util.*;

public class Decimal_to_Binaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n = sc.nextInt();

        int ans =0;
        int i=0;
        while(n!=0)
        {
            int rem = n%2;
            ans = (int) (ans+ rem*Math.pow(10,i));
            n=n/2;
            i++;
           
        }
        System.out.println(ans);
    }
}
