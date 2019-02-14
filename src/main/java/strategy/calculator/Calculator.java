package strategy.calculator;

import java.util.List;

public class Calculator {

    private List<Double> values;
    private Double modifier;
    private Calculation calculation;

    public Calculator() {}

    public void addValue(Double value) {
        this.values.add(value);
    }

    public void setModifier(Double modifier) {
        this.modifier = modifier;
    }

    public void removeValue(Double value) {
        this.values.remove(value);
    }

    public List<Double> processCalculation() {
        return this.calculation.processCalculation(this.values, this.modifier);
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public String toString() {
        return "This is str";
    }

}
