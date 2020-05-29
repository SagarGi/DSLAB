public class PojoBank {

    int accountNumber;
    String name;
    float balance;
    String mobileNumber;

    public void createAccount(int accountNumber, String name, float balance, String mobileNumber)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.mobileNumber = mobileNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getAccount()
    {
        return accountNumber;
    }
    
    public float getBalance()
    {
        return balance;
    }
    public String getContact()
    {
        return mobileNumber;
    }
}