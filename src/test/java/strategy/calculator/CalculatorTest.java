package strategy.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import strategy.calculator.calculations.Addition;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        this.calculator = null;
    }

    @Test
    public void addOneProperDoubleValue() {
        calculator.addValue(42.0);
    }

    @Test
    public void addTowPropperDoubleValuesWithCheck() {
        Double firstValue = 42.0;
        Double secondValue = 84.1231;

        calculator.addValue(firstValue);
        calculator.addValue(secondValue);

        List<Double> checkList = new ArrayList<>();
        checkList.add(firstValue);
        checkList.add(secondValue);

        assertTrue(calculator.toString().contains(checkList.toString()));
    }

    @Test
    public void setProperDoubleModifier() {
        calculator.setModifier(4.2E1);
    }

    @Test
    public void setProperDoubleModifierWithCheck() {
        calculator.setModifier(4.2E1);
        assertTrue(calculator.toString().contains("modifier=" + new Double(42.0).toString()));
    }

    @Test
    public void removeNonExistingValue() {
        assertFalse(calculator.removeValue(42.0));
    }

    @Test(expected = NullPointerException.class)
    public void processCalculationCallNotInitialized() {
        calculator.processCalculation();
    }

    @Test
    public void setAdditionCalculation() {
        calculator.setCalculation(new Addition());
    }



}