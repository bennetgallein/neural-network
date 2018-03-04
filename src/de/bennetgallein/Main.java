package de.bennetgallein;

import java.util.ArrayList;

import de.bennetgallein.neuron.Input;
import de.bennetgallein.neuron.Neuron;

public class Main {
	
	public static void main(String[] args) {
		Input i = new Input(-2, 0);
		Input i2 = new Input(-2, 0);
		
		ArrayList<Input> inputs = new ArrayList<Input>();
		inputs.add(i);
		inputs.add(i2);
		
		Neuron n = new Neuron(inputs, 3);
		System.out.print(n.fire());
	}
}
