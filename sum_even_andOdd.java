public class sum_even_andOdd {
    public static void main(String[] args) {
        int num =552245;
        int evenSum=0;
        int oddSum=0;
        //int arr[]=new int [2];
		  int rem=0;
         // int sum=0;
		 while(num>0)
		 {
			 rem=num%10;
			 num= num/10;
			 if(rem%2==0)
			 {
				 evenSum=evenSum+rem;
                 
			 }
			 else{
				 oddSum=oddSum+rem;
                 
			 }
		 }
		 System.out.println(evenSum);
         System.out.println(oddSum);
    }
}
