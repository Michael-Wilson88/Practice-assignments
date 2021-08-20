public class EqualSum {
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber + secondNumber == thirdNumber) return true;
        else if (firstNumber - secondNumber == thirdNumber) return true;
        else if (firstNumber * secondNumber == thirdNumber) return true;
        else if (firstNumber / secondNumber == thirdNumber) return true;

        else return false;

    }

}
