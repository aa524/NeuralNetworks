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
}

public static void main(String[] args) {

perceptron p = new perceptron(new ArrayRealVector(new double[]{0, 1, 1}), new ArrayRealVector(new double[]{6, 2, 2}), 3);
System.out.println(p.calculateOutput(p));
}


private boolean calculateOutput(perceptron p) {
double output= p.inputs.dotProduct(p.weights) + p.bias;
this.output= (output <= 0) ? false: true;
return this.output;
}
}
