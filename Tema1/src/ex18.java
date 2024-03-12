import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int minim=9;
        while(n>0)
        {
            if(n%10<minim)
            {
                minim=n%10;
            }
            n=n/10;
        }
        System.out.println(minim);
    }
}
