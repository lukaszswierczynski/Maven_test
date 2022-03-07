import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class tests {

    @Test
    public void testIfInRangeFrom10To20(){
        int number=15;
        int lowerBound=10;
        int upperBound=20;

        boolean condition=number >= lowerBound && number <= upperBound;
        assertTrue(condition);
    }

    @Test
    public void testIfModulo2ResultIsZero(){
        int number= (int) (Math.random()*10);
        int result=number%2;
        int expected=0;
        Assertions.assertEquals(expected, result);

    }
    boolean isNumberModulo2EqualZero(int number){
        return number % 2 == 0;
    }

    @Test
    public void testIfResultIsZero(){
        int numberOne=10;
        int numberTwo=10;
        int result=numberOne-numberTwo;
        Assertions.assertEquals(0, result);
    }
}

