import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int i=1;
        int numar=0;
        int suma=0;
        while(i<=n)
        {
            suma=suma+numar;
            numar=numar+2;
            i++;
        }
        System.out.println(suma);
    }
}
