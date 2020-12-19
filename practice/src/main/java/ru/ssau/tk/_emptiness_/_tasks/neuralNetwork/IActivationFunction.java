package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

public interface IActivationFunction {
    double calc(double x);

    enum ActivationFunctionENUM {
        STEP, LINEAR, SIGMOID, HYPERTAN
    }

}
