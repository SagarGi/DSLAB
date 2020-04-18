
public class TestAccount {

    public static void main(String args[])
    {
        Account account = new Account("sagar",2,300);
        account.setBalance(account.getBalance() + 200);
        account.depositeMoney(1000);
        account.withdrawMoney(2000);

        

    }

}