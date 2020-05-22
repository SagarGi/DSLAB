// this is a random java question i found in facebook page

public class Account {

    public String name;
    public int id;
    public double balance;

    // method associated

    public Account(String nameAccount, int idAccount, double balanceAccount)
    {
       name = nameAccount;
       id = idAccount;
       balance = balanceAccount; 
    }

    public Account(String name, int id)
    {
       name = this.name;
       id = this.id;
    }

    public String getName()
    {
        return name;
    }

    public int getID()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setID(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        if(balance < 0)
        {
            System.out.println("Negative is not allowed!!");
        }
        else{
           this.balance = balance;
        }
      
    }

    public void depositeMoney(double amount)
    {
        balance = balance + amount;
    }

    public void withdrawMoney(double amount)
    {
        if(balance > amount)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("There is not enough money at your account!!");
        }
    }


}

// this is the account class created;