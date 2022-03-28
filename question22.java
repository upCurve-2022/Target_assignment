import java.util.*;
public class question22{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=0,b=1,c;
int n=sc.nextInt();
for(int i=0;i<=n;i++){
c=a+b;
a=b;
b=c;
System.out.print(a+",");
}}}
