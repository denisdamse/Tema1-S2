import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            System.out.print(n%10);
            n=n/10;
        }
    }
}
