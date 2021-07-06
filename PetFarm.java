
import java.util.Scanner;

     

public class PetFarm {
	

		
		
		/**
		 * Declaring the array of PetFarm class
		 */
		private Pet[] pets;
		
		
		
		/** 
		 * constructor to declare the size of the class
		 * @param size
		 */
		PetFarm ( int size) {
			this.pets = new Pet[size];
			
		}
		
		
		
		/**
		 * method to scan the pets if they are Kitten or Ostrich
		 * @param scan
		 * declaring the type variable
		 * for loop
		 * while loop when the user enter an invalid input into the program to restart
		 * i++; // this code will increase the i variables for type == 1
		 * i++; // this code will increase the i variables for type == 2
		 */
	
		public void createAnimals(Scanner scan) {
			
		
			//declaring the type variable
			int type =0;
			
			//for loop 
			for(int i=0; i < pets.length;) {
				//while loop when the user enter an invalid input into the program to restart
				while( i<pets.length && (type != 1 || type != 2) ) { 
				System.out.print("1.Cat \n2.Ostrich \nEnter the option: ");
				type = scan.nextInt();
				 
				if(type == 1) {
					
					int numberofkittens = 0;
					
					System.out.print("Enter number of Kittens: ");
					numberofkittens =scan.nextInt();
					pets[i] = new Cat(numberofkittens);
					i++; // this code will increase the i variables for type == 1
				}
				else if ( type == 2) {
					int numberofeggs = 0;
					
					System.out.print("Enter number of eggs: ");
					numberofeggs =scan.nextInt();
					pets[i] = new Ostrich(numberofeggs);
					i++;// this code will increase the i variables for type == 2
				}
				else {
					System.out.println("Invalid input please try again ");
				}
				}
				
					
			
				
			}
			
			}
		
		
	/**
	 * method to print the pets details according to the user input
	 */
	public void processDetails() {
			
			for(int i = 0; i < pets.length; i++) {
				pets[i].ProfitDetails();
				if(pets[i] != null)
					pets[i].printDetails();
			}
		}
			
			
	}

