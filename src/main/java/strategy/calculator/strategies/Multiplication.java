package strategy.calculator.strategies;

import strategy.calculator.Calculation;

import java.util.List;
import java.util.stream.Collectors;

public class Multiplication implements Calculation {

    @Override
    public List<Double> processCalculation(List<Double> values, double modifier) {
        return values.stream().map(orig -> orig * modifier).collect(Collectors.toList());
    }

}
