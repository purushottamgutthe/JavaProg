public class Exceptions1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(RuntimeException r){
            System.out.println(r);
        }
    }
}
