import java.util.Scanner;
public class question21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,start=1;
        System.out.println("Enter any number: ");
        n=s.nextInt();
        System.out.println(1);
        for(int i=1;i<n;i++)
        {
            start=start+i*i;
            if(i%2==1)
                System.out.println("-"+start+" ");
            else
                System.out.println(start+" ");

        }
    }


}