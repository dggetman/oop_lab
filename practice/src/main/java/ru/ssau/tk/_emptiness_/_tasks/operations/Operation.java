package ru.ssau.tk._emptiness_._tasks.operations;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
