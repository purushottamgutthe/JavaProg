import java.util.Scanner;

public class ExceptionBanking {
    public static void main(String[] args) throws WithdrawAmountExceedingDeposit{
        AcountHolder acountHolder1 = 
            new AcountHolder("Purushottam Bharat Gutthe", "Plot no:03 Shrushti Society Kalyani nagar, Pune", "Businessman", 48351190);
        AcountHolder acountHolder2 = 
            new AcountHolder("Pallavi Purushottam Gutthe", "Plot no:03 Shrushti Society Kalyani nagar, Pune", "Doctor", 2500000);
        System.out.println("Husbands Details: ");
        acountHolder1.checkDetails();
        System.out.println("Wifes Details: ");
        acountHolder2.checkDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which account to withdraw money from: ");
        int actChoice = scanner.nextInt();
        switch (actChoice) {
            case 1:
                System.out.print("how much you want to withdraw: ");
                Double amountToBeWithdrawn = scanner.nextDouble();
                acountHolder1.withdrawAmount(amountToBeWithdrawn);
                break;
            case 2: 
                System.out.print("how much you want to withdraw: ");
                Double amountToBeWithdrawn2 = scanner.nextDouble();
                acountHolder2.withdrawAmount(amountToBeWithdrawn2);
                break;
            default:
                break;
        }
        scanner.close();
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
    
    public Boolean withdrawAmount(Double withdrawAmount) throws WithdrawAmountExceedingDeposit{
        if(withdrawAmount>deposit)
            throw new WithdrawAmountExceedingDeposit("Withdraw Amount is greater than Deposit, Request Dimissed");
        else
            return true;
    }

}

class WithdrawAmountExceedingDeposit extends Exception{
    public WithdrawAmountExceedingDeposit(String message){
        super(message);
    }
}