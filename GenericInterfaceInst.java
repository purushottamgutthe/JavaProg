public class GenericInterfaceInst<Gen> extends GenericInterface<Gen>{
    private Gen gen;
   
    void setType(Gen gen){
        this.gen = gen;
    }

    
    public Gen getGen() {
        return gen;
    }
}