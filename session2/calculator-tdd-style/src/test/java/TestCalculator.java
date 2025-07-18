import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void sumIntTest(){
        int sum = calculator.add(1,5);
        assertEquals(6,sum);
    }

    @Test
    void sumLongTest(){
        long sum = calculator.add(-1,5);
        assertEquals(4,sum);
    }

    @Test
    void sumShortTest(){
        short sum = (short) calculator.add(2,-4);
        assertEquals(-2,sum);
    }

    @Test
    void sumFloatTest(){
        float sum = calculator.add(3f,7f);
        assertEquals(10,sum,.001);
    }

    @Test
    void sumDoubleTest(){
        double sum = calculator.add(6.0,2.0);
        assertEquals(8.0,sum);
    }

    @Test
    void differenceIntTest(){
        int difference = calculator.subtract(1,5);
        assertEquals(-4,difference);
    }

    @Test
    void differenceLongTest(){
        long difference = calculator.subtract(-1,5);
        assertEquals(-6,difference);
    }

    @Test
    void differenceShortTest(){
        short difference = (short) calculator.subtract(2,-4);
        assertEquals(6,difference);
    }

    @Test
    void differenceFloatTest(){
        float difference = calculator.subtract(3f,7f);
        assertEquals(-4,difference,.001);
    }

    @Test
    void differenceDoubleTest(){
        double difference = calculator.subtract(6.0,2.0);
        assertEquals(4.0,difference);
    }

    @Test
    void productIntTest(){
        int product = calculator.multiply(1,5);
        assertEquals(5,product);
    }

    @Test
    void productLongTest(){
        long product = calculator.multiply(-1,5);
        assertEquals(-5,product);
    }

    @Test
    void productShortTest(){
        short product = (short) calculator.multiply(2,-4);
        assertEquals(-8,product);
    }

    @Test
    void productFloatTest(){
        float product = calculator.multiply(3f,7f);
        assertEquals(21,product,.001);
    }

    @Test
    void productDoubleTest(){
        double product = calculator.multiply(6.0,2.0);
        assertEquals(12.0,product);
    }

    @Test
    void quotientIntTest(){
        int quotient = calculator.divide(5,1);
        assertEquals(5,quotient);
    }

    @Test
    void quotientLongTest(){
        long quotient = calculator.divide(-5,1);
        assertEquals(-5,quotient);
    }

    @Test
    void quotientShortTest(){
        short quotient = (short) calculator.divide(-4,2);
        assertEquals(-2,quotient);
    }

    @Test
    void quotientFloatTest(){
        float quotient = calculator.divide(-5f,1f);
        assertEquals(-5,quotient);
    }

    @Test
    void quotientDoubleTest(){
        double quotient = calculator.divide(-4.0,2.0);
        assertEquals(-2.0,quotient);
    }

    @Test
    void quotientFloatZeroTest(){
        ArithmeticException exception = assertThrows(ArithmeticException.class, ()->calculator.divide(5f,0f));
        assertEquals("Division by 0",exception.getMessage());
    }

    @Test
    void quotientDoubleZeroTest(){
        ArithmeticException exception = assertThrows(ArithmeticException.class, ()->calculator.divide(5.0,0.0));
        assertEquals("Division by 0",exception.getMessage());
    }
}
