public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String burgerMeat, double price) {
        super("Healthy", burgerMeat, price, "Brown");

        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, addition1Price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name, addition3Price);
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4(addition4Name, addition4Price);
    }
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null)
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " +
                healthyExtra1Price);

        if (this.healthyExtra2Name != null)
            hamburgerPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " +
                healthyExtra2Price);
        System.out.println("The total price of the Healthy burger is " + hamburgerPrice);
            return hamburgerPrice;
    }

}
