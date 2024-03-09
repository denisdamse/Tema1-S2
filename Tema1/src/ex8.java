import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
