package numbers;

public class SwappingTwoNumbersUsingArithmeticLogic {

    public static void main(String[] args){

        int a = 5;
        int b = 10;

        a = a + b; // 15
        b = a - b; //5
        a = a - b; //10

        System.out.println("The swapped value is: " + "for a: "+ a + "for b: "+b);
    }
}
