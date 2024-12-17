public class ExceptionBanking {
    public static void main(String[] args) {
        AcountHolder acountHolder1 = 
            new AcountHolder("Purushottam Bharat Gutthe", "Plot no:03 Shrushti Society Kalyani nagar, Pune", "Businessman", 48351190);
        AcountHolder acountHolder2 = 
            new AcountHolder("Pallavi Purushottam Gutthe", "Plot no:03 Shrushti Society Kalyani nagar, Pune", "Doctor", 2500000);
        System.out.println("Husbands Details: ");
        acountHolder1.checkDetails();
        System.out.println("Wifes Details: ");
        acountHolder2.checkDetails();
    }
}


class AcountHolder{

    private String name,address, profession;
    private float deposit;
    AcountHolder(String name, String address, String profession, float deposit){
        this.name=name;
        this.address=address;
        this.profession=profession;
        this.deposit=deposit;
    }

    public void checkDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Profession: "+profession);
        System.out.println("Deposit: "+deposit);
    }

}

class WithdrawAmountExceedingDeposit extends Exception{
    public WithdrawAmountExceedingDeposit(){
        super("Withdraw Amount is greater than Deposit, Request Dimissed");
    }
}