package problem4;

public class BankManagementSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Sampriti", 21, "sam@gmail.com", 9709338868L);
        Account a1 = new Account(c1, "Bank More", "BM1020", "Recurring");
        c1.addAcount(a1);

        Account a2 = new Account(c1, "Bank More", "BM1020", "Savings");
        c1.addAcount(a2);
        c1.getBankAccountsDetails();

    }
}
