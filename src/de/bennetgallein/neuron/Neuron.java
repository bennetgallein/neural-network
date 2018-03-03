package de.bennetgallein.neuron;

import java.util.ArrayList;

public class Neuron {

	ArrayList<Input> i;
	float b;
	
	public Neuron(ArrayList<Input> input, float b) {
		this.i = input;
		this.b = b;
	}

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
	public double fireSigmoid() {
		double sum = 0;
		for (int z = 0; z < this.i.size(); z++) {
			sum += (this.i.get(z).w * this.i.get(z).x) - this.b;
		}
		return 1 / (1 + Math.exp(-sum));
	}
}
