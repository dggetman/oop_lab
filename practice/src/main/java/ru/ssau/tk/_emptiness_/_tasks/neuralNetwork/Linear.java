package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

public class Linear implements IActivationFunction {
    private double a = 1.0;

    public Linear(double value) {
        this.setA(value);
    }

    public void setA(double value) {
        this.a = value;
    }

    @Override
    public double calc(double x) {
        return a * x;
    }

}

