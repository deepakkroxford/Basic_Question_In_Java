import java.util.*;
public class Fibnacci_series {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int n = sc.nextInt();
       
       if(n==0)
       {
        System.out.println(n);
       }
       int a=0;
       int b =1;
       int c=0;
       for(int i =2;i<=n;i++)
       {
          c =a+b;
          a=b;
          b=c;
       }
       System.out.println(c);
    }
}
