public class check {
    public static void main(String[] args) {
        int num = 21;
        if(num<2)
        {
            System.out.println("not a prime number");
        }
        else if(num==2)
        {
            System.out.println("prime number");
        }
        else{
            for(int i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.println("not a prime number");
                    break;
                }
                else{
                    System.out.println("prime number");
                    break;
                }
            }
        }
    }
}
