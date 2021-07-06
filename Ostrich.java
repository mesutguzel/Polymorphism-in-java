  

public class Ostrich extends Pet {
	
	/**
	 * Declaration of the variables for Pet Class
	 */
	private String bodycover; 
	private int legs;
	private int numberofeggs;
	private double cost;
	private double tax;
	private double profit;
	
	
	
	/**one arg constructor for Cat class - parameter is numberofeggs
	 * @param numberofeggs
	 * setting the values of variables which is given by author
	 */
	public Ostrich(int numberofeggs) {
		
		this.bodycover = "feathers";
		this.legs = 2;
		this.tax = 0.06;
		this.cost = 3.5;
		this.numberofeggs=numberofeggs;
	}
	
	
	
	
	/**
	 *Overriding the methods those are created in super class 
	 *this method will calculate the profit
	 */
	@Override
	public void ProfitDetails() {
		profit =(numberofeggs*cost)-tax *(numberofeggs * cost);
		
	}
	
	/**
	 * Overriding the methods those are created in super class  
	 *this method will print as an output at the end of program
	 */
	@Override
	public void printDetails() {
		System.out.println("I am a Ostrich with " +legs+" legs and very tall, covered with "+bodycover+" and laid " + numberofeggs + " eggs. " + myName + "\'s profit from selling eggs: " + profit);

		
	}

}
