public class DeluxeBurger extends Hamburger{


    private boolean chips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.50, "White");


    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1("Drinks", 2.50);
        System.out.println("Can not change additions!");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2("Chips",2.50 );
        System.out.println("Can not change additions!");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3( "nothing", 0);
        System.out.println("Can not change additions!");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        super.addHamburgerAddition4("nothing", 0);
        System.out.println("Can not change additions!");
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }



}
