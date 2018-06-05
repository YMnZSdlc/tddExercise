package pl.sda.tdd1;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddTwoN() {
        //given
        double firstNumber = 4;
        double secondNumber = 6;
        double result = 10;

        //when
        double actual = Calculator.addTwoN(firstNumber, secondNumber);

        //then
        Assert.assertTrue(actual == result);
    }

    @Test
    public void testSubTwoN() {
        //given
        double firstNumber = 10;
        double secondNumber = 6;
        double result = 4;

        //when
        double actual = Calculator.subTwoN(firstNumber, secondNumber);

        //then
        Assert.assertTrue(actual == result);
    }

    @Test
    public void testMultiplyTwoN() {
        //given
        double firstNumber = 10;
        double secondNumber = 6;
        double result = 60;

        //when
        double actual = Calculator.multiplyTwoN(firstNumber, secondNumber);

        //then
        Assert.assertTrue(actual == result);
    }

    @Test
    @Parameters({"1|2", "3|4", "5|6"})
    public void testMultiplyWitchParam(double first, double second){
        //given

        //when
        double result = calculator.multiplyTwoN(first,second);

        //then
        Assert.assertTrue((first*second)==result);
    }

    @Test
    public void testDivideTwoN() throws InvalidNumberExeption {
        //given
        double firstNumber = 36;
        double secondNumber = 6;
        double result = 6;

        //when
        double actual = Calculator.divideTwoN(firstNumber, secondNumber);

        //then
        Assert.assertTrue(actual == result);
    }

    @Test(expected = InvalidNumberExeption.class)
    public void testDivideWithExpected() throws InvalidNumberExeption {
        //given
        double firstNumber = 36;
        double secondNumber = 0;

        //when
        double actual = Calculator.divideTwoN(firstNumber, secondNumber);
    }

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testDivideWithRule() throws InvalidNumberExeption {
        //given
        double firstNumber = 36;
        double secondNumber = 0;
        expected.expect(InvalidNumberExeption.class);
        expected.expectMessage("Nie dziel przez zero");

        //when
        double actual = Calculator.divideTwoN(firstNumber, secondNumber);
    }

    @Test
    public void testDivideWithTryCach() throws InvalidNumberExeption {
        //given
        double firstNumber = 36;
        double secondNumber = 0;

        //when
        try {
            calculator.divideTwoN(firstNumber, secondNumber);
            Assert.fail("Nie dziel przez zero");
        } catch (InvalidNumberExeption invalidNumberExeption) {

        }
    }

    @Test
    public void testIsEvenN() {
        //given
        double firstNumber = 11;

        //when
        boolean actual = Calculator.isEvenN(firstNumber);

        //then
        Assert.assertTrue(!actual);
    }

    @Test
    @Parameters({"2", "4", "6"})
    public void testIsEvenNWithEven(double first){
        //given

        //when
        boolean result = Calculator.isEvenN (first);

        //then
        Assert.assertTrue(result);
    }

    @Test
    @Parameters({"1", "3", "5"})
    public void testIsEvenNWithOdd(double first){
        //given

        //when
        boolean result = Calculator.isEvenN (first);

        //then
        Assert.assertTrue(!result);
    }


    @Test
    @Parameters({"1,1", "2,2", "3,6", "4,24", "5,120"})
    public void testFactorialNWithParam(double number, double expecedResult){
        //given

        //when
        double actualResult = calculator.factorialN (number);

        //then
        Assert.assertTrue(actualResult==expecedResult);
    }

    @Test
    public void testFactorialN (){
        //given
        double number = 6;
        double expectedResult = 720;

        //when
        double actualResult = calculator.factorialN(number);

        //then
//        Assert.assertTrue(actualResult == expectedResult);
        Assertions.assertThat(expectedResult).isEqualTo(actualResult);
    }


}
