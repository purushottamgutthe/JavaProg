public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            System.out.println("Demonstrating checked exception:");
            checkedExceptionExample();

            System.out.println("\nDemonstrating unchecked exception:");
            uncheckedExceptionExample();

            System.out.println("\nThrowing custom exception:");
            throwCustomException();

        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("\nFinally block executed.");
        }
    }

    // Method to demonstrate a checked exception
    static void checkedExceptionExample() throws Exception {
        throw new Exception("This is a checked exception (must be handled or declared).");
    }

    // Method to demonstrate an unchecked exception
    static void uncheckedExceptionExample() {
        throw new ArithmeticException("This is an unchecked exception (does not require handling).");
    }

    // Method to throw a custom exception
    static void throwCustomException() throws CustomException {
        throw new CustomException("This is a custom exception extending Exception.");
    }
}

// Custom exception class extending Exception (checked exception)
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
