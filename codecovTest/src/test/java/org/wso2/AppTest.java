package org.wso2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    Math math = new Math();

   @Test
    public void addNumbersTest(){
       int num1 = 5;
       int num2 = 8;

       Assert.assertEquals(math.addNumbers(num1, num2), 13);
   }

    @Test
    public void subtractNumbersTest(){
        int num1 = 15;
        int num2 = 8;

        Assert.assertEquals(math.substractNumbers(num1, num2), 7);
    }

    @Test
    public void divisionNumbersTest(){
        int num1 = 15;
        int num2 = 3;

        Assert.assertEquals(math.divideNumbers(num1, num2), 5);
    }


}
