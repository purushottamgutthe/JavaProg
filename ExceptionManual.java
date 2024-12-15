import java.util.Scanner;

public class ExceptionManual {
    public static void main(String[] args) throws NameOutOfLimit {
        System.out.print("Enter your name: ");
        Scanner scan =new Scanner(System.in);
        String name = scan.next();
        scan.close();
        if(name.length()>=12)
            throw new NameOutOfLimit("Name must have less than 12 characters");
        else
            System.out.println("Congrats! your name fulfills the criteria");
    }

}

class NameOutOfLimit extends Exception{
    public NameOutOfLimit (String concerMessage){
        super(concerMessage);
    }
}