import java.util.Scanner;

class TooYoungException extends Exception {
    TooYoungException(String message) {
        super(message);
    }
}

class TooOldException extends Exception {
    TooOldException(String message) {
        super(message);
    }
}

public class age_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new TooYoungException("You are too young");
            } 
            else if (age > 60) {
                throw new TooOldException("You are too old");
            } 
            else {
                System.out.println("You are eligible");
            }
        } 
        catch (TooYoungException e) {
            System.out.println(e.getMessage());
        } 
        catch (TooOldException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Program executed");
            sc.close();
        }
    }
}
