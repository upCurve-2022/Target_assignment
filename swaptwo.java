public class swaptwo {
    public static void main(String args[]){
        int f=20,s=40;
        System.out.println("BEFORE PERFORMING SWAP");
        System.out.println("the first number is"+f);
        System.out.println("the second number is"+s);
        int temp=f;
        f=s;
        s=temp;
        System.out.println("AFTER PERFORMING SWAPPING");
        System.out.println("the first number is"+f);
        System.out.println("the second number is"+f);
    }
}