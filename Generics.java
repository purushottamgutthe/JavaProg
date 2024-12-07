package Advance;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList(); //Normal Arraylist

        arrayList.add(12);
        arrayList.add("Ram");

        System.out.println("First Element is: "+arrayList.get(0));
        System.out.println("Second Element is: "+arrayList.get(1));
    }
}
