import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        System.out.println("enter the first numbers");
        number1=input.nextInt();
        System.out.println("enter the second numbers");
        number2=input.nextInt();
        sum=number1+number2;
        System.out.println("the sum of the numbers is:"+sum);

    }
}