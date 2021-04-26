import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트 진행합니다.
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        /* 테스트 코드 입력 */
        assertTrue(result == 20);
        assertFalse(result == 20);
    }
    @Test
    public void subTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(20, 10);
        /* 테스트 코드 입력 */
        assertTrue(result == 10);
        //assertFalse(result == 20);
    }
    @Test
    public void multiplyTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(20, 5);
        /* 테스트 코드 입력 */
        assertTrue(result == 100);
        //assertFalse(result == 20);
    }
    @Test
    public void divTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(20, 10);
        /* 테스트 코드 입력 */
        assertTrue(result == 2);
        //assertFalse(result == 20);
    }
}