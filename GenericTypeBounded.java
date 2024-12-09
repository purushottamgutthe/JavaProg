public class GenericTypeBounded implements InnerGenericTypeBounded <MainType>{
    public static void main(String[] args) {
        MainType mainType = new MainType(1, 58000, "Pallavi Purushottam Gutthe");
 
    }
}

interface InnerGenericTypeBounded<Type extends MainType> {
    void show(Type type);
    Type get();
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