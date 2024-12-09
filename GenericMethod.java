public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArray = {12,543,123,564,234,56};
        String[] strArray = {"Sita", "Ram", "Laxman", "Hanuman", "Rawan"};
        objectsEach(intArray);
        objectsEach(strArray);      
    }
    public static <GenType> void objectsEach( GenType[] genType){
        for (GenType iterable_element : genType) {
            System.out.println(iterable_element);
        }
        System.out.println();
    }
}
