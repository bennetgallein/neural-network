package de.bennetgallein.neuron;

import java.util.ArrayList;

/**
 * The Neuron class
 * @author Bennet
 *
 */
public class Neuron {
	
	/**
	 * Input Array for the Neuron 
	 */
	ArrayList<Input> i;
	
	/**
	 * the bias (negative of the threshold
	 */
	float b;
	
	/**
	 * 
	 * @param input The Input objects in a ArrayList
	 * @param b the bias of the Neuron
	 */
	public Neuron(ArrayList<Input> input, float b) {
		this.i = input;
		this.b = b;
	}
	
	/**
	 * This returns the output of the Neuron
	 * @return 0 or 1 depending if the output is bigger than 0 or smaller.
	 */
	public float fire() {
		float sum = 0;
		for (int z = 0; z < this.i.size(); z++) {
			sum += (this.i.get(z).w * this.i.get(z).x);
		}
		sum += this.b;
		System.out.println(sum);
		if (sum <= 0) {
			return 0;
		} else {
			return 1;
		}
	}
	/**
	 * This returns the sigmoid function value of the output of the Neuron
	 * @return a float depending on the output
	 */
	public double fireSigmoid() {
		double sum = 0;
		for (int z = 0; z < this.i.size(); z++) {
			sum += (this.i.get(z).w * this.i.get(z).x) - this.b;
		}
		return 1 / (1 + Math.exp(-sum));
	}
}
