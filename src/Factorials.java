import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("number?");
        long i;
        long n = obj.nextInt();

        for(i=1;i<=n;i++) {
            if(Factorial(i)<Factorial(i+1)){
            System.out.println("the factorial of"+" "+ i +" "+ "is"+" "+Factorial(i));
            }
            else {
                System.out.println("the factorial of" + " " + i + " " + "is" + " " + "out of range");
                break;
            }

        }
    }

    public static long Factorial(long n){
        long k=n;
        long factorial=1;
        while (k>0){
            factorial= factorial*k;
            k=k-1;
        }
        return factorial;
    }

}
