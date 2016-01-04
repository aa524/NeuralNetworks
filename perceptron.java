import org.apache.commons.math3.linear.*;
class perceptron {
//binary inputs x1, x2, x3, ..., xn
ArrayRealVector inputs;
ArrayRealVector weights;
double bias;
boolean output;

public perceptron(ArrayRealVector inputs, ArrayRealVector weights, double bias) {
this.inputs= inputs;
this.weights= weights;
this.bias=bias;
this.output= this.calculateOutput();
}

public perceptron(boolean[] inputs, ArrayRealVector weights, double bias) {
double[] doubleInputs= new double[inputs.length];
for (int i=0; i<inputs.length; i++) {
//convert array of booleans to array of doubles
doubleInputs[i]= inputs[i]? 1:0;
}

this.inputs= new ArrayRealVector(doubleInputs);
this.weights= weights;
this.bias=bias;
this.output= this.calculateOutput();
}

public static void main(String[] args) {

perceptron p = new perceptron(new ArrayRealVector(new double[]{0, 1, 1}), new ArrayRealVector(new double[]{6, 2, 2}), -4);
perceptron q = new perceptron(new ArrayRealVector(new double[]{0, 1, 1}), new ArrayRealVector(new double[]{6, 2, 2}), 3);
perceptron r = new perceptron(new ArrayRealVector(new double[]{0, 1, 1}), new ArrayRealVector(new double[]{6, 2, 2}), 3);
perceptron z = new perceptron(new boolean[]{p.getOutput(),q.getOutput(),r.getOutput()}, new ArrayRealVector(new double[]{6, 2, 2}), -3);
System.out.println(z.calculateOutput());
}


private boolean calculateOutput() {
double output= this.inputs.dotProduct(this.weights) + this.bias;
return this.output= (output <= 0) ? false: true;
}

//setters and getters
private void setInputs(ArrayRealVector inputs) {
  this.inputs= inputs;
}
private void setWeights(ArrayRealVector weights) {
  this.weights=weights;
}
private void setBias(double bias) {
  this.bias=bias;
}
private boolean getOutput() {
return this.output;
}
}
