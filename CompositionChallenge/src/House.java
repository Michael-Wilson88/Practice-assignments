public class House {

    private LivingRoom livingRoom;
    private Kitchen kitchen;
    private Bathroom bathroom;
    private Bedroom bedroom;

    public House(LivingRoom livingRoom, Kitchen kitchen, Bathroom bathroom, Bedroom bedroom) {
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.bedroom = bedroom;
    }
    public void hideTV(){
        getLivingRoom().hidingTeleVision();

    }


    private LivingRoom getLivingRoom() {
        return livingRoom;
    }

    private Kitchen getKitchen() {
        return kitchen;
    }

    private Bathroom getBathroom() {
        return bathroom;
    }

    private Bedroom getBedroom() {
        return bedroom;
    }


}
