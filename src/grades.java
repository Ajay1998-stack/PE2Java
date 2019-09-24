import java.util.Scanner;

class grades {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no of Students");
        int n = obj.nextInt();
        if(n<0 || n>100){
            System.out.println("enter valid input");
            //break;
        }
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("The average is"+" "+ avg(arr));
        System.out.println("The maximum is"+" "+ max(arr));
        System.out.println("The minimum is"+" "+ min(arr));
    }

    public static int max(int arr[]){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

    public static int min(int arr[]){
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min= arr[i];
            }
        }
        return min;
    }

    public static float avg(int arr[]){
        int sum=0;
        int count= arr.length;
        for(int i=0;i<count;i++){
            sum= sum+arr[i];
        }
        float avg = sum/count;
        return avg;
    }
}
