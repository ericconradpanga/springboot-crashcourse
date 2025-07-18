import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    void sumTest(){
        int sum = calculator.sum(1,5);
        assertEquals(6,sum);
    }

}
