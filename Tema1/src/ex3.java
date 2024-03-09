import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        int j=scan.nextInt();
        if(i%2==0 && j%2==0)
        {
            System.out.println((i+j)/2);
        }
        else if(i%2!=0 && j%2!=0)
        {
            System.out.println(i*j);
        }
        else
        {
            System.out.println(i+j);
        }
    }
    
}
