package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

public class HyperTan implements IActivationFunction {
    private double a = 1.0;

    public HyperTan() {
    }

    public HyperTan(double value) {
        this.setA(value);
    }

    public void setA(double value) {
        this.a = value;
    }

    @Override
    public double calc(double x) {
        return (1.0 - Math.exp(-a * x)) / (1.0 + Math.exp(-a * x));
    }

    @Override
    public double derivative(double x){
        return (1.0)-Math.pow(calc(x),2.0);
    }
}
