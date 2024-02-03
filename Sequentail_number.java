import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sequentail_number {
    public static void main(String[] args) {

        /*
         it start from 1
         * the meaning of the sequrential number is printing the 1 by 1 number
         * like =[12, 23, 34, 45, 56, 67, 78, 89, 123, 234] if we have to print until 0
         * to 300 continus number.
         * 
         */
        int low = 100;
        int high = 300;
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= 9; i++) // i =2;
        {
            int num = i; // initaily i=1 //num=2
            int nextdigit = i + 1; // nextdigit =2 //nextdigit=3

            while (num <= high && nextdigit <= 9) // here after getting num =1234 so it higher than high so conditon is
                                                  // false it goes to for loop and i++;
            {
                num = num * 10 + nextdigit; // num= 1*10+2=12 // num=12*10+3=123 //num=123*10+4=1234 //num=2*10+3=23
                                            // //num=23*10+4=234
                if (num >= low && num <= high) // condition-> false //condition =>true //condition =>false
                                               // //condition->false //condition ->true
                {
                    ans.add(num); // in list add =123 //in list add = 234
                }
                nextdigit++; // nextdigit++ = 3 //nextdigit =4 //nextdigit =5 //next digit =4
            }
        }
        Collections.sort(ans); //we use this because the list is unorder list .
        System.out.println(ans);

    }
}
