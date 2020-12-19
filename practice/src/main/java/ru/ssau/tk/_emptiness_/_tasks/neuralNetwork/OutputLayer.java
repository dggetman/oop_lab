package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

public class OutputLayer extends NeuralLayer {

    public OutputLayer(int numberOfNeurons, IActivationFunction iaf, int numberOfInputs) {
        super(numberOfNeurons, iaf);
        this.numberOfInputs = numberOfInputs;
        nextLayer = null;
        init();
    }

    @Override
    public void setNextLayer(NeuralLayer layer) {
        nextLayer = null;
    }

    @Override
    public void setPreviousLayer(NeuralLayer layer) {
        previousLayer = layer;
        if (layer.nextLayer != this)
            layer.setNextLayer(this);
    }

}
