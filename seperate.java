import java.util.Scanner;
class seperate {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Scanner sc= new Scanner (System.in);
        double n=sc.nextDouble();
        int a=(int)(n/1);
        double b=(n%1);
        int c=(int)(b/0.00000001);
        System.out.println(c);
        System.out.println(a+" "+c);
    }
}