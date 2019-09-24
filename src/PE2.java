import java.util.Scanner;

public class PE2 {
    public void palidrome(int length,String rev,String str){
        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
    static boolean power(int n){
        if(n==0){
            return false;
        }
        while (n!=1){
            if(n%4!=0){
                return false;
            }
            n=n/4;
        }
        return true;
    }
    public static void main(String[] args) {
        String str, rev = "";
        int  n;
        Scanner sc = new Scanner(System.in);
//        str = sc.nextLine();
        n= sc.nextInt();
//        int length = str.length();
//        PE2 obj = new PE2();
//        obj.palidrome(length,rev,str);
       if(power(n)){
           System.out.println("power of 4");
       }
       else{
           System.out.println("not power of 4");
       }
    }
}
