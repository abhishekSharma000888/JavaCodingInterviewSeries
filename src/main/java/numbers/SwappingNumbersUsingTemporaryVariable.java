package numbers;

public class SwappingNumbersUsingTemporaryVariable {

    public static void main(String[] args){

        int a = 1;
        int b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of swapped variable a is: "+ a + " The value of swapped b is: "+b);

    }
}
