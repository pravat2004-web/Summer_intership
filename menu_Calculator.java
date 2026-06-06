import java.util.Scanner;

class menu_Calculator
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter first number: ");
        int a =sc.nextInt();

        System.out.println("enter second number: ");
        int b =sc.nextInt();

        System.out.println("Menu");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition ="+(a+b));
                break;
            
            case 2:
                System.out.println("Substraction ="+(a-b));
                break;
            case 3:
                System.out.println("Multiplication ="+(a*b));
                break;
            case 4:
                if(b!=0)
                    System.out.println("Division ="+(a/b));
                else
                    System.out.println("Division by zero is not possible");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}