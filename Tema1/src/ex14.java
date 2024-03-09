public class ex14 {
    public static void main(String[] args) {
        int x=7;
        int y=993;
        while(x<=993 && y>=7)
        {
            if(x%17==0 || x%13==0  && y%19==0 || y%7==0)
            {
                System.out.println(x+" "+y);
            }
            x++;
            y--;
        }
    }
}
