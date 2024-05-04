import java.util.*;
import java.util.HashMap;

class fasenating {
    boolean fasenatingnumber(long n)
         //time complexity is O(nlogn)
    {
        if (n < 100) {
            return false;
        }
        String num1 = Long.toString(n);
        String num2 = Long.toString(n * 2);
        String num3 = Long.toString(n * 3);
        String ans = num1 + num2 + num3;

        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == '0') {
                continue;
            }
            else if (!hs.contains(ans.charAt(i))) {
                hs.add(ans.charAt(i));
                count++;
            } else {
                return false;
            }
        }
        if (count == 9) {
            return true;
        }
        return false;

    }
}

public class fasenatingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        fasenating ans = new fasenating();
        System.out.println(ans.fasenatingnumber(n));
        

    }
}
