public class GenericTypeBounded implements InnerGenericTypeBounded<MainType> {

    private MainType mainType;

    // Constructor
    public GenericTypeBounded(MainType mainType) {
        this.mainType = mainType;
    }

    public static void main(String[] args) {
        MainType mainType = new MainType(1, 58000, "Pallavi Purushottam Gutthe");
        GenericTypeBounded generic = new GenericTypeBounded(mainType);

        // Display the details using the show() method
        generic.show(mainType);

        // Retrieve and display data using the get() method
        MainType retrievedMainType = generic.get();
        System.out.println("Retrieved: " + retrievedMainType);
    }

    @Override
    public void show(MainType type) {
        System.out.println("Details of MainType: ");
        System.out.println("ID: " + type.getNum());
        System.out.println("Salary: " + type.getSal());
        System.out.println("Name: " + type.getName());
    }

    @Override
    public MainType get() {
        return new MainType(12, 40000, "Puru");
    }
}

interface InnerGenericTypeBounded<Type extends MainType> {
    void show(Type type);
    Type get();
}

class MainType {
    private int num;
    private int sal;
    private String name;

    public MainType(int num, int sal, String name) {
        this.num = num;
        this.sal = sal;
        this.name = name;
    }

    // Getters
    public int getNum() {
        return num;
    }

    public int getSal() {
        return sal;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MainType [num=" + num + ", sal=" + sal + ", name=" + name + "]";
    }
}