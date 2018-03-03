package de.bennetgallein.neuron;

/**
 * The Input class
 * @author Bennet
 *
 */
public class Input {
	
	/**
	 * The weight of the input
	 */
	float w;
	/**
	 * The value of the input
	 */
	float x;

	/**
	 * Constructor for the Input
	 * @param w the weight of the Input
	 * @param x the value of the Input
	 */
	public Input(float w, float x) {
		this.w = w;
		this.x = x;
	}
}
