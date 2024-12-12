public class GenericDual {
    public static void main(String[] args) {
        Generic <Double, Float> classTypeChecker = new Generic<>();
        if (classTypeChecker.typeChecker(23.57, 34.f))
            System.out.println("Types are the same");
        else
            System.out.println("Types aren't same");

    }
}

class Generic<T, M>{
    boolean typeChecker(T type, M main){
        if(type.getClass()==main.getClass())
            return true;
        else
            return false;
    }
}
