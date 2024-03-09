import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        boolean verif=true;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                verif=false;
            }
        }
        if(verif==true)
        {
            System.out.println(n+" este prim");
        }
        else
        {
            System.out.println(n+" nu este prim");
        }

    }
}
