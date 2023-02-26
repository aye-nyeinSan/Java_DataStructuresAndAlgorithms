public class CheckingAccount extends Account {

    public CheckingAccount(String account_no) {
        super(account_no);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void withdraw(double fund) {
        if(super.balance-fund<=0){
            fund=0;
            System.out.println("Your account is not enough money.");
        } else {
            super.balance-=fund;
        }
        
    }
    
}
