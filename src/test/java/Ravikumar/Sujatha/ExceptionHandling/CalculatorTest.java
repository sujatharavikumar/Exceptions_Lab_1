package Ravikumar.Sujatha.ExceptionHandling;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 9/30/16.
 */
public class CalculatorTest {

    @Test
    public void addTest(){
        int actualOutput = Calculator.add(2,6);
        int expectedOutput = 8;
        Assert.assertEquals("The add method should return 8", expectedOutput, actualOutput);
    }

    @Test
    public void subtractTest(){
        int actualOutput = Calculator.subtract(2,6);
        int expectedOutput = -4;
        Assert.assertEquals("The subtract method should return -4", expectedOutput, actualOutput);
    }

    @Test
    public void multiplyTest(){
        int actualOutput = Calculator.multiply(0,6);
        int expectedOutput = 0;
        Assert.assertEquals("The multiply method should return 0", expectedOutput, actualOutput);
    }

    @Test
    public void divideTest(){
        try{
            int actualOutput = Calculator.divide(4,2);
            int expectedOutput = 2;
            Assert.assertEquals("The divide method should return 2", expectedOutput, actualOutput);

        }
        catch(DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void divideByZeroTest(){
        try{
            Calculator.divide(4,0);
        }
        catch(DivisionByZeroException e){
            Assert.assertTrue(e.getMessage().equals("Division by 0 exception"));
        }
    }


    @Test
    public void squareRootTest(){
        try {
            double actualOutput = Calculator.squareRoot(9);
            double expectedOutput = 3;
            Assert.assertTrue(expectedOutput==actualOutput);
        } catch (ComplexNumberException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void complexSquareRootTest(){
        try {
            Calculator.squareRoot(-9);
        } catch (ComplexNumberException e) {
            Assert.assertTrue(e.getMessage().equals("Complex Number Exception occured"));
        }
    }

}
