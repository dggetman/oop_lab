package ru.ssau.tk._emptiness_._tasks.neuralNetwork;

public class HiddenLayer extends NeuralLayer {

    public HiddenLayer(int numberOfNeurons, IActivationFunction iaf,
                       int numberOfInputs) {
        super(numberOfNeurons, iaf);
        this.numberOfInputs = numberOfInputs;
        init();
    }

    @Override
    public void setPreviousLayer(NeuralLayer previous) {
        this.previousLayer = previous;
        if (previous.nextLayer != this)
            previous.setNextLayer(this);
    }

    @Override
    public void setNextLayer(NeuralLayer next) {
        nextLayer = next;
        if (next.previousLayer != this)
            next.setPreviousLayer(this);
    }

}
