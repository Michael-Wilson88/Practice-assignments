public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String meat, double price, String breadRollType) {

        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public double itemizeHamburger(){
    return this.price + addHamburgerAddition1();

    }

    public void addHamburgerAddition1(String name,double price, String addition1Name){
        double addition1Price = 0;
        this.price = addition1Price + this.price;

        if (addition1Name.equalsIgnoreCase("lettuce")){Math.round(addition1Price = this.price + 0.75);
        }
        if (addition1Name.equalsIgnoreCase("cheese")){Math.round(addition1Price = this.price + 1.13);
        }
        if (addition1Name.equalsIgnoreCase("tomato")){Math.round(addition1Price = this.price + 0.27);
        }
        if (addition1Name.equalsIgnoreCase("bacon")){Math.round(addition1Price = this.price + 1.76);
        }
        else addition1Price = this.price;
        System.out.println("Burger " + name + " added: " + addition1Name + " " + addition1Price );
    }
    public void addHamburgerAddition2(String name, String addition2Name){
        double addition2Price = 0;
        this.price = addition2Price + this.price;

        if (addition2Name.equalsIgnoreCase("lettuce")){Math.round(addition2Price = this.price + 0.75);
        }
        if (addition2Name.equalsIgnoreCase("cheese")){Math.round(addition2Price = this.price + 1.13);
        }
        if (addition2Name.equalsIgnoreCase("tomato")){Math.round(addition2Price = this.price + 0.27);
        }
        if (addition2Name.equalsIgnoreCase("bacon")){Math.round(addition2Price = this.price + 1.76);
        }
        else addition2Price = this.price;
        System.out.println("Burger " + name + " added: " + addition2Name + " " + addition2Price );
    }
    public void addHamburgerAddition3(String name, String addition3Name){
        double addition3Price = 0;
        this.price = addition3Price + this.price;

        if (addition3Name.equalsIgnoreCase("lettuce")){Math.round(addition3Price = this.price + 0.75);
        }
        if (addition3Name.equalsIgnoreCase("cheese")){Math.round(addition3Price = this.price + 1.13);
        }
        if (addition3Name.equalsIgnoreCase("tomato")){Math.round(addition3Price = this.price + 0.27);
        }
        if (addition3Name.equalsIgnoreCase("bacon")){Math.round(addition3Price = this.price + 1.76);
        }
        else addition3Price = this.price;
        System.out.println("Burger " + name + " added: " + addition3Name + " " + addition3Price );
    }
    public void addHamburgerAddition4(String name, String addition4Name){
        double addition4Price = 0;
        this.price = addition4Price + this.price;

        if (addition4Name.equalsIgnoreCase("lettuce")){Math.round(addition4Price = this.price + 0.75);
        }
        if (addition4Name.equalsIgnoreCase("cheese")){Math.round(addition4Price = this.price + 1.13);
        }
        if (addition4Name.equalsIgnoreCase("tomato")){Math.round(addition4Price = this.price + 0.27);
        }
        if (addition4Name.equalsIgnoreCase("bacon")){Math.round(addition4Price = this.price + 1.76);
        }

        else addition4Price = this.price;
        System.out.println("Burger " + name + " added: " + addition4Name + " " + addition4Price );
    }




}
