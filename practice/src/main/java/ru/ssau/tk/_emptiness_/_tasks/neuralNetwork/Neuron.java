package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

import java.util.*;

public class Neuron {
    protected ArrayList<Double> weight; // веса
    private ArrayList<Double> input; //входные
    private Double output; //выходные
    private Double outputBeforeActivation; // значение функции активации
    private int numberOfInputs = 0;
    protected Double bias = 1.0;
    private IActivationFunction activationFunction; //функция активации

    public Neuron() {
    }

    public Neuron(int numberOfInputs) {
        this.numberOfInputs = numberOfInputs;
        weight = new ArrayList<>(numberOfInputs + 1);
        input = new ArrayList<>(numberOfInputs);
    }

    public Neuron(int numberOfInputs, IActivationFunction iaf) {
        this.numberOfInputs = numberOfInputs;
        weight = new ArrayList<>(numberOfInputs + 1);
        input = new ArrayList<>(numberOfInputs);
        activationFunction = iaf;
    }

    public void init() {
        if (numberOfInputs > 0) {
            for (int i = 0; i <= numberOfInputs; i++) {
                double newWeight = RandomNumberGenerator.GenerateNext();
                try {
                    this.weight.set(i, newWeight);
                } catch (IndexOutOfBoundsException iobe) {
                    this.weight.add(newWeight);
                }
            }
        }
    }

    public void setInputs(double[] values) {
        if (values.length == numberOfInputs) {
            for (int i = 0; i < numberOfInputs; i++) {
                try {
                    input.set(i, values[i]);
                } catch (IndexOutOfBoundsException iobe) {
                    input.add(values[i]);
                }
            }
        }
    }

    public void setInputs(ArrayList<Double> values) {
        if (values.size() == numberOfInputs) {
            input = values;
        }
    }

    public ArrayList<Double> getArrayInputs() {
        return input;
    }

    public double[] getInputs() {
        double[] inputs = new double[numberOfInputs];
        for (int i = 0; i < numberOfInputs; i++) {
            inputs[i] = this.input.get(i);
        }
        return inputs;
    }

    public void setInput(int i, double value) {
        if (i >= 0 && i < numberOfInputs) {
            try {
                input.set(i, value);
            } catch (IndexOutOfBoundsException iobe) {
                input.add(value);
            }
        }
    }

    public double getInput(int i) {
        return input.get(i);
    }

    public double[] getWeights() {
        double[] weights = new double[numberOfInputs + 1];
        for (int i = 0; i <= numberOfInputs; i++) {
            weights[i] = weight.get(i);
        }
        return weights;
    }

    public Double getWeight(int i) {
        return weight.get(i);
    }

    public Double getBias() {
        return weight.get(numberOfInputs);
    }

    public ArrayList<Double> getArrayWeights() {
        return weight;
    }

    public void updateWeight(int i, double value) {
        if (i >= 0 && i <= numberOfInputs) {
            weight.set(i, value);
        }
    }

    public int getNumberOfInputs() {
        return this.numberOfInputs;
    }

    public void setWeight(int i, double value) throws NeuralException {
        if (i >= 0 && i < numberOfInputs) {
            this.weight.set(i, value);
        } else {
            throw new NeuralException("Invalid weight index");
        }
    }

    public double getOutput() {
        return output;
    }

    public void calc() {
        outputBeforeActivation = 0.0;
        if (numberOfInputs > 0) {
            if (input != null && weight != null) {
                for (int i = 0; i <= numberOfInputs; i++) {
                    outputBeforeActivation += (i == numberOfInputs ? bias : input.get(i)) * weight.get(i);
                }
            }
        }
        output = activationFunction.calc(outputBeforeActivation);
    }

    public Double calc(ArrayList<Double> _input) {
        Double _outputBeforeActivation = 0.0;
        if (numberOfInputs > 0) {
            if (weight != null) {
                for (int i = 0; i <= numberOfInputs; i++) {
                    _outputBeforeActivation += (i == numberOfInputs ? bias : _input.get(i)) * weight.get(i);
                }
            }
        }
        return activationFunction.calc(_outputBeforeActivation);
    }

    public Double calc(Double[] _input) {
        Double _outputBeforeActivation = 0.0;
        if (numberOfInputs > 0) {
            if (weight != null) {
                for (int i = 0; i <= numberOfInputs; i++) {
                    _outputBeforeActivation += (i == numberOfInputs ? bias : _input[i]) * weight.get(i);
                }
            }
        }
        return activationFunction.calc(_outputBeforeActivation);
    }

    public Double derivative(Double[] _input) {
        Double _outputBeforeActivation = 0.0;
        if (numberOfInputs > 0) {
            if (weight != null) {
                for (int i = 0; i <= numberOfInputs; i++) {
                    _outputBeforeActivation += (i == numberOfInputs ? bias : _input[i]) * weight.get(i);
                }
            }
        }
        return activationFunction.derivative(_outputBeforeActivation);
    }

    public ArrayList<Double> calcBatch(ArrayList<ArrayList<Double>> _input) {
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i < _input.size(); i++) {
            result.add(0.0);
            Double _outputBeforeActivation = 0.0;
            for (int j = 0; j < numberOfInputs; j++) {
                _outputBeforeActivation += (j == numberOfInputs ? bias : _input.get(i).get(j)) * weight.get(j);
            }
            result.set(i, activationFunction.calc(_outputBeforeActivation));
        }
        return result;
    }

    public ArrayList<Double> derivativeBatch(ArrayList<ArrayList<Double>> _input) {
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i < _input.size(); i++) {
            result.add(0.0);
            Double _outputBeforeActivation = 0.0;
            for (int j = 0; j < numberOfInputs; j++) {
                _outputBeforeActivation += (j == numberOfInputs ? bias : _input.get(i).get(j)) * weight.get(j);
            }
            result.set(i, activationFunction.derivative(_outputBeforeActivation));
        }
        return result;
    }

    public void setActivationFunction(IActivationFunction iaf) {
        this.activationFunction = iaf;
    }

    public double getOutputBeforeActivation() {
        return outputBeforeActivation;
    }

    public void deactivateBias() {
        this.bias = 0.0;
    }

    public void activateBias() {
        this.bias = 1.0;
    }
}
