package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

import java.util.ArrayList;

public class NeuralNet {
    private InputLayer inputLayer;
    private ArrayList<HiddenLayer> hiddenLayer;
    private OutputLayer outputLayer;
    private final int numberOfHiddenLayers;
    private final int numberOfInputs;
    private final int numberOfOutputs;
    private ArrayList<Double> input;
    private ArrayList<Double> output;

    public NeuralNet(int numberOfInputs, int numberOfOutputs,
                     int[] numberOfHiddenNeurons, IActivationFunction[] hiddenAcFnc,
                     IActivationFunction outputAcFnc) {
        numberOfHiddenLayers = numberOfHiddenNeurons.length;
        this.numberOfInputs = numberOfInputs;
        this.numberOfOutputs = numberOfOutputs;
        if (numberOfHiddenLayers == hiddenAcFnc.length) {
            input = new ArrayList<>(numberOfInputs);
            inputLayer = new InputLayer(numberOfInputs);
            if (numberOfHiddenLayers > 0) {
                hiddenLayer = new ArrayList<>(numberOfHiddenLayers);
            }
            for (int i = 0; i < numberOfHiddenLayers; i++) {
                if (i == 0) {
                    try {
                        hiddenLayer.set(i, new HiddenLayer(numberOfHiddenNeurons[i],
                                hiddenAcFnc[i],
                                inputLayer.getNumberOfNeuronsInLayer()));
                    } catch (IndexOutOfBoundsException iobe) {
                        hiddenLayer.add(new HiddenLayer(numberOfHiddenNeurons[i],
                                hiddenAcFnc[i],
                                inputLayer.getNumberOfNeuronsInLayer()));
                    }
                    inputLayer.setNextLayer(hiddenLayer.get(i));
                } else {
                    try {
                        hiddenLayer.set(i, new HiddenLayer(numberOfHiddenNeurons[i],
                                hiddenAcFnc[i], hiddenLayer.get(i - 1)
                                .getNumberOfNeuronsInLayer()
                        ));
                    } catch (IndexOutOfBoundsException iobe) {
                        hiddenLayer.add(new HiddenLayer(numberOfHiddenNeurons[i],
                                hiddenAcFnc[i], hiddenLayer.get(i - 1)
                                .getNumberOfNeuronsInLayer()
                        ));
                    }
                    hiddenLayer.get(i - 1).setNextLayer(hiddenLayer.get(i));
                }
            }
            if (numberOfHiddenLayers > 0) {
                outputLayer = new OutputLayer(numberOfOutputs, outputAcFnc,
                        hiddenLayer.get(numberOfHiddenLayers - 1)
                                .getNumberOfNeuronsInLayer()
                );
                hiddenLayer.get(numberOfHiddenLayers - 1).setNextLayer(outputLayer);
            } else {
                outputLayer = new OutputLayer(numberOfInputs, outputAcFnc,
                        numberOfOutputs);
                inputLayer.setNextLayer(outputLayer);
            }
        }
    }

    public void setInputs(ArrayList<Double> inputs) {
        if (inputs.size() == numberOfInputs) {
            this.input = inputs;
        }
    }

    public void setInputs(double[] inputs) {
        if (inputs.length == numberOfInputs) {
            for (int i = 0; i < numberOfInputs; i++) {
                try {
                    input.set(i, inputs[i]);
                } catch (IndexOutOfBoundsException iobe) {
                    input.add(inputs[i]);
                }
            }
        }
    }

    public void calc() {
        inputLayer.setInputs(input);
        inputLayer.calc();
        if (numberOfHiddenLayers > 0) {
            for (int i = 0; i < numberOfHiddenLayers; i++) {
                HiddenLayer hl = hiddenLayer.get(i);
                hl.setInputs(hl.getPreviousLayer().getOutputs());
                hl.calc();
            }
        }
        outputLayer.setInputs(outputLayer.getPreviousLayer().getOutputs());
        outputLayer.calc();
        this.output = outputLayer.getOutputs();
    }

    public ArrayList<Double> getArrayOutputs() {
        return output;
    }

    public double[] getOutputs() {
        double[] _outputs = new double[numberOfOutputs];
        for (int i = 0; i < numberOfOutputs; i++) {
            _outputs[i] = output.get(i);
        }
        return _outputs;
    }

    public void printNet() {
        System.out.println("Neural Network: " + this.toString());
        System.out.println("\tInputs:" + String.valueOf(this.numberOfInputs));
        System.out.println("\tOutputs:" + String.valueOf(this.numberOfOutputs));
        System.out.println("\tHidden Layers: " + String.valueOf(numberOfHiddenLayers));
        for (int i = 0; i < numberOfHiddenLayers; i++) {
            System.out.println("\t\tHidden Layer " +
                    String.valueOf(i) + ": " +
                    String.valueOf(this.hiddenLayer.get(i)
                            .numberOfNeuronsInLayer) + " Neurons");
        }
    }
}
