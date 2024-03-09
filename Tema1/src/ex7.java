import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        int sum=0;
        while(n>0)
        {
            sum=sum+n;
            n--;
            count++;
        }
        System.out.println(sum/count);
    }
}
