import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int maxim=0;
        while(n>0)
        {
            if(n%10>maxim)
            {
                maxim=n%10;
            }
            n=n/10;
        }
        System.out.println(maxim);
    }
}
