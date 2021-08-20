public class Main {

    public static void main(String[] args) {
	// write your code here

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println( "Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My min value for byte  = " + myMinByteValue);
        System.out.println("My max value for byte = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My min value for Short  = " + myMinShortValue);
        System.out.println("My max value for Short = " + myMaxShortValue);

        // long altijd een L achter het nummer zetten anders herkent Java het niet
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My min value for Long  = " + myMinLongValue);
        System.out.println("My max value for Long = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        // Hieronder herkent hij myMinByteValue als integerook al is het een byte, vul de waarde (byte) in en hij stelt het in als Byte
        // dit geldt voor elke variabele. JAva zal het snel automatisch naar integer instellen, je kunt dit dan verhelpen door de juiste variabele op deze manier in te stellen.
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        byte newByteValue = 55;
        short newShortValue = 15000;
        int newIntValue = 5000;
        long newLongValue = newIntValue + newByteValue + newShortValue;
        long newTotalValue = (10 * newLongValue) + 50000;
        System.out.println(newTotalValue);
    }

}
