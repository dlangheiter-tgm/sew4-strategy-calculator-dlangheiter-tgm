package strategy.calculator;

import java.util.ArrayList;
import java.util.List;

public class Addition implements Calculation {

    @Override
    public List<Double> processCalculation(List<Double> values, double modifier) {
        List<Double> retList = new ArrayList<>();
        for(Double value : values) {
            retList.add(value + modifier);
        }
        return retList;
    }

}
