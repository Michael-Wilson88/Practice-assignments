public class VipCustomer {

    private String vipName;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer(String vipName, double creditLimit, String emailAdress){
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }
    public VipCustomer(){
        this("Name", 10000,"emailAdress");
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAdress() {
        return emailAdress;
    }
    public String getVipName() {
        return vipName;
    }
}
