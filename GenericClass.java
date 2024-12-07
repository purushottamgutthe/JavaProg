public class GenericClass {
    public static void main(String[] args) {
        InnerGenericClass<Integer> innerGenericClass = new InnerGenericClass<>(42);
        innerGenericClass.typePrint();
    }
}

class InnerGenericClass <Type> {
    private Type T;
    
    InnerGenericClass(Type t){
        this.T=t;
    }

    public void typePrint(){
        System.out.println("Type of Generic is "+T.getClass().getName()+ " and Value is "+T);
    }
}