package numbers;

public class SwapTwoNumbersThirdApproach {

    //Using Bitwise XOR

    public static void main(String[] args){

        int a=5;
        int b=10;

        a = a ^ b;
        b = a ^ b; // becomes original a
        a = a ^ b; // becomes original b

        System.out.println("The value of a after swapping is: "+ a + "The value of b after swapping is: "+ b);
    }
}
