import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value = " + myMinDoubleValue);
        System.out.println("Double max value = " + myMaxDoubleValue);

        int myIntVaLue = 5 / 3;
        float myFloatValue = 5 / 3f;
        double myDoubleValue = 5 / 3d;
        System.out.println("MyIntValue = " + myIntVaLue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue " + myDoubleValue);

        double pound = 200d;
        double kilogram = 0.45359237;
        double poundToKilogram = pound * kilogram;
        System.out.println(poundToKilogram);
        // om zeer precies te kunnen werken heb je ook nog de javaclass BigDecimal




    }
}
