import java.util.Scanner;
public class ex2 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i=scan.nextInt();
        if(i>=1 && i<=5)
        {
            switch (i) {
                case 1:
                    System.out.println("UNU");
                    break;
                case 2:
                    System.out.println("DOI");
                    break;
                case 3:
                    System.out.println("TREI");
                    break;
                case 4:
                    System.out.println("PATRU");
                    break;
                case 5:
                    System.out.println("CINCI");
                    break;
            }
        }
        else
        {
            System.out.println("INVALID");
        }
    }
    
}