public class BankManagement {
    public static void main(String[] args) {

    // 1.user creation
    PojoBank user1 = new PojoBank();
    int accountNumber = 12345;
    String name = "Sagar Guurng";
    float balance = 2000;
    String mobileNumber = "9829107652";
    user1.createAccount(accountNumber, name, balance, mobileNumber);

    PojoBank user2 = new PojoBank();

    int accountNumber1 = 54321;
    String name1 = "Niral Guurng";
    float balance1 = 5000;
    String mobileNumber1 = "9829107634";
    user2.createAccount(accountNumber1, name1, balance1, mobileNumber1);
   


    // updation
    user1.updateName("Sagar Thapa");
    user1.updateNumber("9883628632");

    // deposite
    user1.depositeBalance(4500);

    // withdrawal

    user1.withDrawal(1000);
    user1.myBalance();
}
}