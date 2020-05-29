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

    public void updateName(String name)
    {
        this.name = name;
    }
    public void updateAccount(int  accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void updateBalance(float  balance)
    {
        this.balance = balance;
    }
    public void updateNumber(String mobileNumber)
    {
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

    public void displayUserInformation()
    {
        System.out.println("Name : " + getName());
        System.out.println("Account Number : " + getAccount());
        System.out.println("Balance : " + getBalance());
        System.out.println("Mobile Number : " + getContact());
    }
}