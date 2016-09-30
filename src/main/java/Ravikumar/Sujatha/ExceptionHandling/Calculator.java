package Ravikumar.Sujatha.ExceptionHandling;

/**
 * Created by sujatharavikumar on 9/30/16.
 */
public class Calculator {

    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static int subtract(int num1, int num2){
        return num1-num2;
    }

    public static int multiply(int num1, int num2){
        return num1*num2;
    }

    public static int divide(int num1, int num2) throws DivisionByZeroException{
        if (num2 == 0)
            throw new DivisionByZeroException("Division by 0 exception");
        return num1/num2;
    }

    public static double squareRoot(int num) throws ComplexNumberException{

        if (num < 0)
            throw new ComplexNumberException("Complex Number Exception occured");
        return Math.sqrt(num);

    }


}
