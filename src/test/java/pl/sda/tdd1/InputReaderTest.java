package pl.sda.tdd1;

import org.junit.Assert;
import org.junit.Test;

public class InputReaderTest {

    @Test
    public void  testExtractEquation(){
        // given
        String readedInput = "23+45";
        EqutionModel test01 = new EqutionModel(23,45,"+");

        //when
        EqutionModel expected = InputReader.exctracEquation(readedInput);

        //then
        Assert.assertEquals(expected, test01);
    }





}
