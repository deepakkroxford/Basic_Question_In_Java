import java.util.*;

public class Fibnacci_series {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int n = sc.nextInt();
      System.out.println();
      int a = 0;
      int b = 1;
      int c ;
      System.out.println(a);
      for (int i = 2; i <=n; i++) {
         System.out.println(b);
         
         c = a + b;
         a = b;
         b = c;

      }
      System.out.println();
      System.out.println("the fibnacii of the number is "+b);
   }
}

//dry run the code for better understand 
//fibnacci series look likes 0,1,1,2,3,5,8,13,21,34 ans so on
/*
   so first we insialize the number a =0 and b =1;
   so if the input is 1 or 2 it gives the value 0 and 1 respectively 
   let take the value of n =5;
   so we know that for finding the fibnacci we add the two number
   in our case we add the number  a+b and store in c =a+b;
   before storing the num we have to print the value of a that is inisially 0
   and then a=b it means the vlaue of b store in a 
   b=c the vlaue of c store in b;

   again the i++
   so 3 is less than 5 so true now the value of a =1 and the value of b =1
   so we do add operation and store the value in c = a+b 
   and then a=b store the value of b in a so now a is 1;
   b=c  store the value of c in b and now b is 2;

   again the i++
   so 4 is less than 5 so its true now the value of a =1 and b =2;
   we do add operation and store the value in c =a+b;
   and a=b it means now the value of a =2;
   and the b =c now the value of b =3

   again the i++
   so 5 is equal to 5 so its true now the value of a=2,and b =3;
   before this operation we have to print the value of a
   so we do add operation c=a+b;
   and then a=b so the value of a is 3
   and the  b=c so the value of c is 5

   so output is =0,1,1,2
   
   
   
*/
   
