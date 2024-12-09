public class GenericTypeBounded {

}

public interface InnerGenericTypeBounded<Type extends MainType> {
    
}

class MainType{
    private int num;
    private int sal;
    private String name;
    MainType(int num, int sal, String name){
        this.name=name;
        this.sal=sal;
        this.num=num;
    }

    //MainType mainType = new MainType(12, 40000, "Puru");

    public MainType getData(){
        return new MainType(12, 40000, "Puru");
    }

}