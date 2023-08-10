package problem4;
import java.util.Random;
public class Account extends Bank{
    private Customer accHolder;
    private long accountNo;
    private double balance;
    String type;

    public Account(Customer c,String branch, String IFSC, String type){
        super(branch, IFSC);
        this.balance = 0;
        this.type = type;
        this.accHolder = c;
        generateAccountNo();
        setNoOfAccount();
    }

    public void generateAccountNo(){
        Random rand = new Random();
        int randomNo = 1000000 + rand.nextInt(9000000);
        this.accountNo = randomNo;
    }
    public double getBalance(){
        return balance;
    }
    public Customer getAccHolder(){
        return accHolder;
    }
    public long getAccountNo(){
        return accountNo;
    }
}
