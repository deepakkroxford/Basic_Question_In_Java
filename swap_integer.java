import java.util.*;
public class swap_integer {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the no 1st");
        int a = sc.nextInt();

        System.out.println("enter the no 2st");
        int b = sc.nextInt();

        //swapping 
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println();
        System.out.println("after swapping");
        System.out.println(a+" "+" "+b);

    }
}
