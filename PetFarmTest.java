

import java.util.Scanner;

public class PetFarmTest {
	
/**
 * creating main method
 * @param args
 * creating a scanner to read from user
 * getting the number of pets in PetFarm from the user
 * creating the farm objects for running the methods for created objects in previous classes
 * invoking the methods from PetFarm class
 * scanner is closed
 */


public static void main(String[] args) {
		
	//creating a scanner to read from user
		Scanner scan = new Scanner(System.in);
		
	
		
		
		//getting the number of pets in PetFarm from the user
		System.out.print("How many pets are there in your PetFarm: ");
		int num = scan.nextInt();
		
		//creating the farm objects for running the methods for created objects in previous classes
		PetFarm farm = new PetFarm(num);
		
		//invoking the methods from PetFarm class
		farm.createAnimals(scan);
		System.out.println();
		farm.processDetails();
		
		//scanner is closed
		scan.close();
}

}
