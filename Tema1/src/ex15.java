public class ex15 {
    public static void main(String[] args) {
        for(int i=3020;i<=3929;i++)
        {
            if(i/1000==3 && (i%100)/10==2 && i%9==0)
            {
                System.out.println(i+" ");
            }
        }
    }
}
