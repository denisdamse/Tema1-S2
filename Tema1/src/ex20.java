import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int rezerva=n;
        int m=0;
        while(n>0)
        {
            m=m*10+n%10;
            n=n/10;
        }
        if(rezerva==m)
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Nu este palindrom");
        }
    }
}
