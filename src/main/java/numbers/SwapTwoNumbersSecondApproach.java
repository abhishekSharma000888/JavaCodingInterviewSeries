package numbers;

public class SwapTwoNumbersSecondApproach {

    public static void main(String[] args){

        int a=5;
        int b=9;

        //Arithmetic approach

        a = a + b;
        b= a - b;      // becomes original a
        a = a - b;     // becomes original b

        System.out.println("The value of a after swapping is: "+ a + " The value of b after swapping is: "+ b);

    }
}
