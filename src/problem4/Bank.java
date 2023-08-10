package problem4;

public class Bank{
    final static String name = "SBI";
    private static int noOfAccounts = 0;
   public  String branch;
   private String IFSC;
    public Bank(String branch, String IFSC){
        this.branch = branch;
        this.IFSC = IFSC;
    }
    public int getNoOfAccounts(){
        return noOfAccounts;
    }
    public void setNoOfAccount(){
        noOfAccounts++;
    }
    public String getIFSC(){
        return IFSC;
    }


}
