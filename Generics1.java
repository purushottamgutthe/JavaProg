import java.util.ArrayList;

public class Generics1 {

    //@SuppressWarnings                       //Annotation is used for the suppressing the warnings
    public static void main(String[] args) {
        ArrayList rawArrayList = new ArrayList();
        ArrayList <String> genericArrayList = new ArrayList<String>();

        rawArrayList.add(22);
        rawArrayList.add("RajaLaxmi");

        genericArrayList.add("22");
        genericArrayList.add("RajaLaxmi");

        try{
            int rawItem1 = (int) rawArrayList.get(0);
            int rawItem2 = (int) rawArrayList.get(1);
            
            System.out.println("First two values of raw arraylist "+ rawItem1 +" "+ rawItem2);
        }catch(ClassCastException e){
            System.out.println("Caugh Type casting exception in raw: "+e);
        }

        try{
            String genItem1 = genericArrayList.get(0);
            String genItem2 = genericArrayList.get(1);

            System.out.println("\nFirst two values of genric arraylist "+ genItem1 +" and "+ genItem2);
        }catch(ClassCastException e){
            System.out.println("Caugh Type casting exception in Genric: " +e);
        }
    }
}