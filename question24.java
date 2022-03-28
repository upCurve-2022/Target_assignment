import java.util.*;
public class question24{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        int a=1;
        while(N>0){
            a=a*X;
            N--;
        }
        System.out.println(a);}}