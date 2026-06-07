import java.util.Scanner;

public class SumOfDigit 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int x =sc.nextInt();
        int sum =0;

        while(x>0)
        {
            sum=sum+(x%10);
            x=x/10;
        }
        System.out.println("Sum of digits: "+sum);

        sc.close();
    }
}