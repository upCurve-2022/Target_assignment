import java.util.Scanner;
public class question12
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
            else
                System.out.print(" -"+i+" ");
        }
    }
}