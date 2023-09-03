import java.util.Scanner;

public class Leading_Zero_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value n1");
        int n1 = sc.nextInt();
        System.out.println("enter the value n2");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (n2 >= 100) {
                String formattedStr = String.format("%03d", i);
                System.out.println(formattedStr);
            } else if (n2 >= 10) {
                String formattedStr = String.format("%02d", i);
                System.out.println(formattedStr);
            } else {
                String formattedStr = String.format("%d", i);
                System.out.println(formattedStr);
            }
        }
    }
}
