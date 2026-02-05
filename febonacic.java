public class febonacic {
    
    public static void main(String[] args) 
    {
        int j=20;
          
        int p=0,b=1;

        System.out.println(p+" "+b+" ");

        for (int i=2;i<j;i++)
        {
            int c = p+ b;
            System.out.print(c + " ");
            p = b;
            b = c;
        }
        
    }
}
