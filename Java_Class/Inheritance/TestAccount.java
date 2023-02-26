public class TestAccount {
    public static void main(String[] args) {
        double i=0;
        SavingsAccount sa1=new SavingsAccount("Galileo");
        CheckingAccount ca1=new CheckingAccount("Albert");
        sa1.deposit(100000);
        sa1.withdraw(200000);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);
        sa1.withdraw(10);sa1.withdraw(10);
        ca1.deposit(1000000);
        ca1.withdraw(2000000);
    }
}
