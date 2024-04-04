
import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class testCalc {

    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumCalculatorShouldReturnOne() {
        int sum = 1;
        int actualResult = sumCalculator.sum(sum);
        Assertions.assertEquals(1, actualResult);
    }
    @Test
    void sumCalculatorShouldReturnSix() {
        int sum = 3;
        int actualResult = sumCalculator.sum(sum);
        Assertions.assertEquals(6, actualResult);
    }
    @Test
    void sumCalculatorShouldThrowIllegalArgumentExceptionWhenZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
        }