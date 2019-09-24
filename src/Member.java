import java.util.Scanner;

class MemberVariable{
    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            Member mem= new Member();
            System.out.println("enter name");
            String str= obj.next();
            mem.setName(str);
            int age=obj.nextInt();
            mem.setAge(age);
            int salary=  obj.nextInt();
            mem.setSalary(salary);
        System.out.println(mem.getAge());
        System.out.println(mem.getName());
        System.out.println(mem.getSalary());
        }
    }

public class Member {
    private String name;
    private int age;
    private int salary;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
