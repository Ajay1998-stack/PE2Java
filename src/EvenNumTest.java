import java.util.Scanner;

class any {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        EvenNumTest evenNumTest=new EvenNumTest();
        if (evenNumTest.isEven(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

public class EvenNumTest {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
