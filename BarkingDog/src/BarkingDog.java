public class BarkingDog {
    public static void main(String[] args) {
    shouldWakeUp(true, 10);
        System.out.println(shouldWakeUp(true, 10));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){


        if(hourOfDay < 8 && hourOfDay > 23) return true;

        else return false;

    }

}

