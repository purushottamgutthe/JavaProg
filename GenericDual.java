import java.util.Scanner;

public class GenericDual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         
        System.out.print("Enter any type of data1: ");
        Object val1 = parsing(scanner.nextLine());
        System.out.print("Enter any type of data2: ");
        Object val2 = parsing(scanner.nextLine());
        scanner.close();
        Generic classTypeChecker = new Generic();
        classTypeChecker.typeChecker(val1, val2);
        if (classTypeChecker.typeChecker(val1, val2))
            System.out.println("Types are the same");
        else
            System.out.println("Types aren't same");
    }

    private static Object parsing(String val){
        if(val.matches("-?\\d+"))
            return Integer.parseInt(val);
        else if(val.matches("-?\\d*\\.\\d+"))
            return Double.parseDouble(val);
        else if (val.length()==1) {
            return val.charAt(0);
        }
        else if(val.equalsIgnoreCase("true") || val.equalsIgnoreCase("false"))
            return Boolean.parseBoolean(val);
        else
            return val;
    }
}

class Generic{
    <T, M>boolean typeChecker(T type, M main){
        if(type.getClass()==main.getClass())
            return true;
        else
            return false;
    }
}
