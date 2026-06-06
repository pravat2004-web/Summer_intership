import java.util.Scanner;

public class CheckNumber
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number:");
        int x=sc.nextInt();

        if(x>0)
        {
            System.out.println("number is positive.");
        }
        else if(x<0)
        {
            System.out.println("number is negetive.");
        }
        else
        {
            System.out.println("number is zero.");
        }
        sc.close();
    }
}