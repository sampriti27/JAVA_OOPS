package problem4;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    int age;
    private String email;
    private long phoneNo;
    private ArrayList<Account> bankAccounts;

    public Customer(String customerName, int age, String email, long phNo){
        this.customerName = customerName;
        this.age = age;
        this.email = email;
        this.phoneNo = phNo;
        this.bankAccounts = new ArrayList<>();
    }
    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
    public void addAcount(Account a){
        bankAccounts.add(a);
    }
    public void getBankAccountsDetails() {
        int len = bankAccounts.size();
        if(len == 0){
            System.out.println("No bank account linked!");
        }
        for (Account b: bankAccounts) {
            String details = "{" +
                    "Account Number : " + b.getAccountNo() + " ," +
                    "Account Type : " + b.type + " ," +
                    "Account Holder : " + b.getAccHolder().getCustomerName() + " ," +
                    "Branch : " + b.branch + " ," +
                    "IFSC Code : " + b.getIFSC() + " ," +
                    "}";
            System.out.println(details);
            }
        }

}
