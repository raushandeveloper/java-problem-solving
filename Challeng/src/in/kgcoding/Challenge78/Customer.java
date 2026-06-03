package in.kgcoding.Challenge78;

public class Customer {
    static void main(String[] args) {
        BankAccount account = new BankAccount("001","Raushan Singh");
        account.deposiMoney(100);
        System.out.println( (account.withdrawMoney(200)));
        account.deposiMoney(-40);
        account.withdrawMoney(0);
    }
}
