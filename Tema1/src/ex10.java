public class ex10 {
    public static void main(String[] args) {
        
        int n=1000;
        int numar=0;
        int x=0;
        while(x==0)
        {
            for(int i=2;i<n/2;i++)
            { 
                if(n%i==0)
                {
                    
                    numar=n;
                }
            }
            n++;
        }
        System.out.println(numar);
    }
}
