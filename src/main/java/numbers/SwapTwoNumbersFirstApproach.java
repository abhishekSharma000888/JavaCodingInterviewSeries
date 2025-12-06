package numbers;

public class SwapTwoNumbersFirstApproach {

    //Using temporary variable

    public static void main(String[] args){

        int a = 5;
        int b = 9;
        int temp = a; // the temporary variable

        a = b;
        b = temp;

        System.out.println("The value of a is: "+ a+ " The value of b is: "+ b);

        // Zero overflow risk
        // Easy to implement
        // Least execution time/Best practice
    }
}
