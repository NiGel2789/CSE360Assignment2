package cse360assign2;

/**
 * A class called AddingMachine
 */
public class AddingMachine {

	/**
	 * The total sum of numbers after calculations.
	 */
	private int total;
	
	/**
	 * A string that tracks the calculation history, starting from the initial value
	 * of 0.
	 */
	private String transHist = "0";
	
	/**
	 * A method to initialize the total variable to 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * A method to return the total sum.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * A method that adds a value parameter to the total variable and continues
	 * tracking the calculation history by adding a "+ 'value'" to the string.
	 * @param value An integer to be added to the total variable.
	 */
	public void add (int value) {
		total = total + value;
		transHist = transHist + " + " + value;
	}
	
	/**
	 * A method that subtracts a value parameter from the total variable and
	 * continues tracking the calculation history by adding a "- 'value'" to
	 * the string.
	 * @param value An integer to be subtracted from the total variable.
	 */
	public void subtract (int value) {
		total = total - value;
		transHist = transHist + " - " + value;
	}
	
	public String toString () {
		return transHist;
	}

	/**
	 * A method to clear.
	 */
	public void clear() {
	
	}
}
