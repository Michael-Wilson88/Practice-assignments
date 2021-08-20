public class Main {
    public static void main(String[] args) {
    Hamburger John = new Hamburger("John", "Angus", 3.55, "White");
    John.addHamburgerAddition1("Bacon", 1.75);
    John.addHamburgerAddition2("Cheese", 1.20);
    John.addHamburgerAddition3("Tomato", 0.45);
    John.addHamburgerAddition4("Egg", 0.55);
     John.itemizeHamburger();



    DeluxeBurger Sjaak = new DeluxeBurger();
    Sjaak.addHamburgerAddition1("egg", 0.75);
    Sjaak.addHamburgerAddition2("Crap", 5);
    Sjaak.itemizeHamburger();


    HealthyBurger Noa = new HealthyBurger("Vega", 5.40);
        Noa.addHamburgerAddition1("Bacon", 1.70);
        Noa.addHamburgerAddition2("Cheese", 1.20);
        Noa.addHamburgerAddition3("Tomato", 0.40);
        Noa.addHamburgerAddition4("Egg", 0.50);
        Noa.addHealthyAddition1("Lentils", 1.80);
        Noa.addHealthyAddition2("Beetroot", 1.30);
      Noa.itemizeHamburger();
    }
}
