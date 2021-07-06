

public class Cat extends Pet {

	
	/**
	 * Declaration of the variables for Cat Class
	 */
	private String bodycover; 
	private int legs;
	private int numberofkittens;
	private int cost;
	private double tax;
	private double profit;
	
	
	
	/**
	 * one arg constructor for Cat class - parameter is numberofkittens
	 * @param numberofkittens
	 * setting the values of variables which is given by author
	 */
	
	public Cat(int numberofkittens) {
		
		this.bodycover = "fur";
		this.legs = 4;
		this.tax = 0.12;
		this.cost = 400;
		this.numberofkittens=numberofkittens;
		
	}
	
	

	
	
	/**
	 * Overriding the methods those are created in super class  
	 * this method will calculate the profit
	 */
	@Override
	public void ProfitDetails() {
		profit= (numberofkittens*cost)-tax *( numberofkittens * cost);
		
	}

	
	
	/**
	 * Overriding the methods those are created in super class
	 *this method will print as an output at the end of program
	 */
	@Override
	public void printDetails() {
		System.out.println("I am a Cat with " +legs+" legs, covered with "+bodycover +" and have " + numberofkittens + " Kittens. " + myName + "\'s profit from selling Kittens: " + profit);

		
	}

}
