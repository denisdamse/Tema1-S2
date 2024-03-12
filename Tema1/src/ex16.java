import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=0;
        while(n>0)
        {
            m=m*10+n%10;
            n=n/10;
        }
        while(m>0)
        {
            System.out.println(m%10);
            m=m/10;
        }

    }
}
