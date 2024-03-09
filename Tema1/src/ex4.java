import java.util.Scanner;
public class ex4 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        if(i<=j && i<=k)
        {
            System.out.println(i);
        }
        else if(j<=i && j<=k)
        {
            System.out.println(j);
        }
        else
        {
            System.out.println(k);
        }
    }
}
