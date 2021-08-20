public class LivingRoom {

    private String table;
    private String couch;
    private int television;
    private boolean rug;
    private int chair;
    private int people;


    public LivingRoom(String table, String couch, int television, boolean rug, int chair, int people) {
        this.table = table;
        this.couch = couch;
        this.television = television;
        this.rug = rug;
        this.chair = chair;

    }

    public String getTable() {
        return table;
    }

    public String getCouch() {
        return couch;
    }

    public int getTelevision() {
        return television;

    }

    public boolean isRug() {
        return rug;
    }

    public int getPeople() {
        return people;
    }

    public void setChair(int chair) {
        this.chair = chair;
    }

    public int getChair() {
        return chair;
    }


    public void hidingTeleVision(){
        if (getPeople() >= 5){
            System.out.println("Party time, hide the tv");
        }
        else System.out.println("Netflix and chill");
    }
}
