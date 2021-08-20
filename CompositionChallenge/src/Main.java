public class Main {
    public static void main(String[] args) {

        LivingRoom woonKamer = new LivingRoom("Eiken", "Driezitter", 1, true, 5, 6);
        Kitchen keuken = new Kitchen("Combi", "Kitchen Aid", 2, 4);
        Bathroom badKamer = new Bathroom(true, 3, false);
        Bedroom slaapKamer = new Bedroom("BedSpring", "Schuifdeurkast", 2);
        House redHouse = new House(woonKamer, keuken, badKamer, slaapKamer);
        redHouse.hideTV();
    }
}
