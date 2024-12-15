import java.util.Scanner;

public class ExceptionDefined {
    public static void main(String[] args) throws InvalidInput{
        System.out.print("Enter the Age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        if(age<19)
            throw new InvalidInput("Age should be 18 or more!");
        else
            System.out.println("You're good to go");
    }
}

  class InvalidInput extends Exception {
    public InvalidInput(String ageLimit){
        super(ageLimit);
    }
}