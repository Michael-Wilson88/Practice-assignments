import javax.print.DocFlavor;
import java.math.BigDecimal;

public class Hamburger{


    private String burgerName;
    private String burgerMeat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    //Overload


    public Hamburger (String burgerName, String burgerMeat){
        this(null, null, 0, null);
    }

    public Hamburger(String burgerName, String burgerMeat, double price, String breadRollType) {

        this.burgerName = burgerName;
        this.burgerMeat = burgerMeat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Price = addition1Price;
        this.addition1Name =addition1Name;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Price = addition2Price;
        this.addition2Name = addition2Name;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Price = addition3Price;
        this.addition3Name = addition3Name;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Price = addition4Price;
        this.addition4Name = addition4Name;
    }
    public double itemizeHamburger() {
       double hamburgerPrice = this.price;


        if (addition1Name != null){
            hamburgerPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null) {
            hamburgerPrice += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if (addition3Name != null) {
            hamburgerPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if (addition4Name != null) {
            hamburgerPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        System.out.println(this.burgerName + " Hamburger " + " on a " + this.breadRollType + " roll " + " price is " + hamburgerPrice);
        return hamburgerPrice;
    }
}
