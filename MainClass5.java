class BankAccount
{
    long accNum;
    double accBal;
    void withdraw(double amt){
        System.out.println("withdrawel from :"+ accNum);
        accBal=accBal-amt;
        System.out.println("Withdrawel Success Available Balance :"+accBal);
    }
    void deposit(double amt)
    {
        System.out.println("deposit to :"+accNum);
        accBal = accBal+amt;
        System.out.println("Deposit Success Available Balance : "+accBal);
    }
}

public class MainClass5 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accNum = 3540069882626l;
        acc1.accBal = 25000.0;
        acc1.withdraw(5000.0);
        acc1.deposit(12000);

        System.out.println("------------------->");

        BankAccount acc2 = new BankAccount();
        acc2.accNum = 6599566956596l;
        acc2.accBal = 50000;
        acc2.deposit(8000);
        acc2.withdraw(32000);
    }
}
