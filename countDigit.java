public class countDigit {
    public static void main(String[] args) {
        int a= 103820;

        //1st approach 
        int count = (int)(Math.log10(a))+1;
        System.out.println("using the log10 "+count);


        //2nd approach
        int count1=0;
        while(a>0)
        {
            count1++;
            a = a/10;

        }
        System.err.println("using loop "+count1);
    }
}
