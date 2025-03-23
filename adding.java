public class adding {
    public static void main(String[] args) {
        String s ="greekgreek";
        // s=s.replaceFirst("greek", "greekfor");
        // System.out.println(s);

        
        String name = "Suman Ku for Singh";
        String arr[] = name.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==2)
            {
                System.out.println(arr[i]);
            }
        }

    }
}
