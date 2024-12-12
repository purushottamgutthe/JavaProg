public class GenericOverloading {
    public static void main(String[] args) {
        String[] StringArr= new String[]{"One", "Two", "Three", "Four"};
        Integer[] intArr = {23, 45, 65 ,4345 , 535};
        printThing(StringArr);
        printThing(intArr);
    }

    static <Ar> void printThing(Ar[] element){
        for (Ar iterator : element) {
            System.out.print(iterator+" ");
        }
        System.out.println();
    }
}