package strategy.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import strategy.calculator.strategies.Addition;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdditionTest {

    Calculation calculation;

    @Before
    public void setUp() throws Exception {
        this.calculation = new Addition();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void processCalculationTwoProperDouble() {
        double modifier = 5;

        List<Double> inputList = new ArrayList<>();
        inputList.add(42.0);
        inputList.add(24.0);

        List<Double> testList = new ArrayList<>();
        for(Double d : inputList) {
            testList.add(d + modifier);
        }

        List<Double> gotList = calculation.processCalculation(inputList,modifier);

        assertEquals(testList, gotList);
    }
}