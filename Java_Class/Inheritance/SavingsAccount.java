public class SavingsAccount extends Account {

   
    private final int WithDraw_Limit=5;
    private int winthdraw_no=1;

    public SavingsAccount(String account_no) {
        super(account_no);
        //TODO Auto-generated constructor stub
    }

    public void withdraw(double fund) {
        if((super.balance-fund>0)&& (winthdraw_no<= WithDraw_Limit)){
            super.balance-=fund;
            System.out.println(winthdraw_no);
            System.out.println(balance);
        } else {

            System.out.println("Your withdraw can not process.");
            System.out.println("This month you attempt to withdraw"+winthdraw_no);
        }
        
    }

    
}
