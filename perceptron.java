class perceptron {
//binary inputs x1, x2, x3, ..., xn
boolean[] inputs;
double[] weights;
double threshold;
boolean output;

public perceptron(boolean[] inputs, double[] weights, double threshold) {
this.inputs= inputs;
this.weights= weights;
this.threshold=threshold;
}

public static void main(String[] args) {
perceptron p = new perceptron(new boolean[]{false, true, true}, new double[]{6, 2, 2}, 3);
System.out.println(calculateOutput(p));
}


private static boolean calculateOutput(perceptron p) {
double sum=0;
for (int i=0; i<p.inputs.length; i++) {
	int inputInt= p.inputs[i] ? 1:0;
	sum+= inputInt*p.weights[i];
	}
return (sum > p.threshold) ? true:false;

}
}
