package strategy.calculator;

import java.util.List;

public interface Calculation {

    public List<Double> processCalculation(List<Double> values, double modifier);

}
