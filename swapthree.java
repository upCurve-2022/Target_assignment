public class swapthree {
        public static void main(String args[]){
            int f=20,s=40,t=30;
            System.out.println("BEFORE PERFORMING SWAP");
            System.out.println("the first number is"+f);
            System.out.println("the second number is"+s);
            System.out.println("the third number is"+t);
            int temp=f;
            f=s;
            s=t;
            t=temp;
            System.out.println("AFTER PERFORMING SWAPPING");
            System.out.println("the first number is"+f);
            System.out.println("the second number is"+s);
            System.out.println("the third number is"+t);
        }
    }