package com.example.calculatorminiapplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class CalculatorMiniApplicationTests {


    @Test
    public void testSquareRoot() {
        assertEquals(4.0, CalculatorMiniApplication.squareRoot(16), 0.0001); // Square root of 16 is 4
        assertEquals(5.0, CalculatorMiniApplication.squareRoot(25), 0.0001); // Square root of 25 is 5
        assertEquals(2.0, CalculatorMiniApplication.squareRoot(4), 0.0001);  // Square root of 4 is 2
        assertEquals(3.0, CalculatorMiniApplication.squareRoot(9), 0.0001);  // Square root of 9 is 3
    }

    @Test
    public void testFactorial() {
        assertEquals(1, CalculatorMiniApplication.factorial(0));  // Factorial of 0 is 1
        assertEquals(1, CalculatorMiniApplication.factorial(1));  // Factorial of 1 is 1
        assertEquals(120, CalculatorMiniApplication.factorial(5)); // Factorial of 5 is 120
        assertEquals(720, CalculatorMiniApplication.factorial(6)); // Factorial of 6 is 720
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, CalculatorMiniApplication.naturalLog(1), 0.0001); // Natural log of 1 is 0
        assertEquals(0.6931, CalculatorMiniApplication.naturalLog(2), 0.0001); // Natural log of 2 is approximately 0.6931
        assertEquals(1.0986, CalculatorMiniApplication.naturalLog(3), 0.0001); // Natural log of 3 is approximately 1.0986
        assertEquals(1.6094, CalculatorMiniApplication.naturalLog(5), 0.0001); // Natural log of 5 is approximately 1.6094
    }

    @Test
    public void testPower() {
        assertEquals(8.0, CalculatorMiniApplication.power(2, 3), 0.0001); // 2 raised to the power 3 is 8
        assertEquals(16.0, CalculatorMiniApplication.power(4, 2), 0.0001); // 4 raised to the power 2 is 16
        assertEquals(25.0, CalculatorMiniApplication.power(5, 2), 0.0001); // 5 raised to the power 2 is 25
        assertEquals(64.0, CalculatorMiniApplication.power(4, 3), 0.0001); // 4 raised to the power 3 is 64
    }
}