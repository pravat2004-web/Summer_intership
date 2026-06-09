import java.util.*;

class divisionException {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y,result;
        System.out.println("enter the first number: ");
        x=sc.nextInt();

        System.out.println("enter the second number: ");
        y=sc.nextInt();

        try {
            result=x/y;
            System.out.println("Result"+result);
        } catch (ArithmeticException e) {
            System.out.println("Exception arise :"+e);
            System.out.println("cannot divide a number by zero.");
        }
        System.out.println("complete execution.");
    }
}
