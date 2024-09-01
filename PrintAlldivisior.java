public class PrintAlldivisior {
    public static void main(String[] args) {
        int a =36;
        for(int i=1;i<=36;i++)
        {
            if(a%i==0)
            {
                System.out.print("  "+i);
            }
        }
        System.out.println();

        for(int i=1;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                    System.out.println(i);

                    if(a/i!=i) 
                    {
                            System.out.println(a/i); //this will add other half of the divisor
                    }
            }
        }
    }
}
