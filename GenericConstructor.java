public class GenericConstructor {
    
    public static void main(String[] args) {
        WithGenConstructr withGenConstructr = new WithGenConstructr(11);
        withGenConstructr.greet();
    }
}

class WithGenConstructr{
    WithGenConstructr(int value){
        System.out.println(value);
    }

    public <T> WithGenConstructr(T value){
        System.out.println(value);
    }

    public void greet(){
        System.out.println("This program is for understanding the generic constructor");
    }
}
