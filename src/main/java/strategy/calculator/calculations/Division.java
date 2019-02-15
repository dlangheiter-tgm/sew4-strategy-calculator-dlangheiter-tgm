package strategy.calculator.calculations;

import strategy.calculator.Calculation;

import java.util.List;
import java.util.stream.Collectors;

public class Division implements Calculation {

    @Override
    public List<Double> processCalculation(List<Double> values, double modifier) {
        return values.stream().map(orig -> orig / modifier).collect(Collectors.toList());
    }

}
