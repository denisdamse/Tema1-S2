import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                int verif=0;
                for(int j=2;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        verif++;
                    }
                }
                if(verif<=1)
                {
                    System.out.println(i);
                }
                verif=0;
            }
        }
    }
}
