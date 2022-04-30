import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        System.out.println(" this is world");

        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int a=input.nextInt();
       if ( a%2==0 && a%3==0){
           System.out.println("your age is divisible by 6 and this is your age: " +a);

       }




    }
}
