import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
        System.out.println(n);
    }
}
