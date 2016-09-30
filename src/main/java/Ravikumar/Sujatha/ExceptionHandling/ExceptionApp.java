package Ravikumar.Sujatha.ExceptionHandling;

/**
 * Created by sujatharavikumar on 9/30/16.
 */
public class ExceptionApp {

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 2;
        int num3 = 9;
        System.out.println(Calculator.add(num1, num2));
        System.out.println(Calculator.subtract(num1, num2));
        System.out.println(Calculator.multiply(num1, num2));
        try{
            System.out.println(Calculator.divide(num1, num2));
            Calculator.squareRoot(num3);
        }
        catch(DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
        catch(ComplexNumberException e){
            System.out.println(e.getMessage());

        }


    }

}
