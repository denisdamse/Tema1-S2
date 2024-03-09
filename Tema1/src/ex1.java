import java.util.Scanner;
public class ex1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int numar=scan.nextInt();
        if(numar>10 || numar<1)
        {
            System.out.println("INVALID");
        }
        else if(numar<5)
        {
            System.out.println("RESPINS");
        }
        else
        {
            System.out.println("ADMIS");
        }
    }

}
