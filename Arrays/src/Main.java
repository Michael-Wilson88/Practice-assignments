public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[25];
        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        // wat er staat is eigenlijk:
        // int[] myIntArray;
        // myInArray = new Int[10] waarbij de lengte van de array aangeduid wordt met 10
        // int [] kun je ook aanduiden met float, double, long etc dus dan krijg je double []

        //myIntArray[0] = 45;
        //myIntArray[1] =476;
        //myIntArray[2] = 30;
        //myIntArray = {1,2,3,4,5,6,7,8,9,10}; dit doe je dus in plaats van myIntArray= new int[10] aan het begin van je code

        //myIntArray[5] = 50;
       // System.out.println(myIntArray[4]);
        //System.out.println(myIntArray[0]);
        //System.out.println(myIntArray[6]);
        //System.out.println(myIntArray[8]);
        // hier zie je dus dat de waarde van myIntArray van 1-10 neergezet worden maar omdat een array op 0 begint zit de waarde 10 op nummer 9
        for (int i = 0; i < myIntArray.length; i++) {  // i<10 kun je ook vervangen met i<myIntArray.length
            myIntArray[i] = i * 10;
        }

        printArray(myIntArray);
    }
        //i<10 kun je ook vervangen met i<myIntArray.length. het voordeel hiervan is dat je dan de waarde van 10 kan veranderen
        // bovenaan en dat hij dat automatisch overal vervangt. Hiermee heb je altijd de volledige lengte van je array.
        //for (int i=0; i<10; i++){
        //System.out.println("Element " + i + ", value is " + myIntArray[i]);

        public static void printArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println("Element " + i + ", value is " + array[i]);
            }
        }
    }