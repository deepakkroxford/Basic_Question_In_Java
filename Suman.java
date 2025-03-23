import java.util.Arrays;

public class Suman {
    public static void main(String[] args) {
        int arr[] = {2367,5215,32167};
        for(int i=0;i<arr.length;i++)
        {
            int sum =0;
            int num = arr[i];
            while(num!=0)
            {
                int rem= num%10;
                sum = sum+rem;
                num = num/10;
            }
            arr[i]=sum;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Sum of digits for " + arr[i] + " is " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Sum of digits for " + arr[i] + " is " + arr[i]);
        }
    }
    
}
