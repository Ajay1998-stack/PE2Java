import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;

public class user {
        private String firstName;
        private String lastName;
        private int age;
        private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isValidAge(int n){
        if(n>18 &&  n<60){
            return true;
        }
        return false;
    }

    public String getFullName(){
        return firstName+lastName;
    }
}
class employee{
    public static void main(String[] args) {
        user obj= new user();
        int n;
        Scanner sca = new Scanner(System.in);
        System.out.println("enter a number");
        n = sca.nextInt();
        if(n>0 && n<100) {
            obj.setAge(n);
        }
        if(obj.isValidAge(n)){
            System.out.println("Valid Age");
        }
        else{
            System.out.println("not a vlaid age");
        }
        System.out.printf(obj.getFullName());

    }
}
