import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void sumIntTest(){
        int sum = calculator.sum(1,5);
        assertEquals(6,sum);
    }

    @Test
    void sumLongTest(){
        long sum = calculator.sum(-1,5);
        assertEquals(4,sum);
    }

    @Test
    void sumShortTest(){
        short sum = (short) calculator.sum(2,-4);
        assertEquals(-2,sum);
    }

    @Test
    void sumFloatTest(){
        float sum = calculator.sum(3f,7f);
        assertEquals(10,sum,.001);
    }

    @Test
    void sumDoubleTest(){
        double sum = calculator.sum(6.0,2.0);
        assertEquals(8.0,sum);
    }

}
