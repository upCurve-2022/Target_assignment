import java.util.*;
public class evenodd{
    public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the num ");
    n=s.nextInt();
    if(n%2==0)

    {
        System.out.println("given is even number ::" + n);
    }
    else
    {
        System.out.println("given is odd number::"+n);
    }
}
}