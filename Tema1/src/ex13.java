public class ex13 {
    public static void main(String[] args) {
        int x=17;
        int y=983;
        while(x<=981 && y>=19)
        {
            if(x%17==0 && y%19==0)
            {
                System.out.println(x+" "+y);
            }
            x++;
            y--;
        }
    }
}
