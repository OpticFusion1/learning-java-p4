
public class BuildingBlocks {
	
	public static void main(String[] args) {
		
		//Question 1
		/* Copy the code below and use it to create a new multidimesonal array
		 * with different dimensions and different values, then print it out.
		 */
		int my2dArray[][] = new int[2][3];
		my2dArray[0][0] = 3;
		my2dArray[0][1] = 10;
		my2dArray[0][2] = 22;
		
		my2dArray[1][0] = 66;
		my2dArray[1][1] = 55;
		my2dArray[1][2] = 99;
		
		for(int row=0;row<my2dArray.length;row++){
			for(int col =0;col<my2dArray[row].length;col++){
				System.out.println(my2dArray[row][col]);
			}
		}
		
		//The copy
		int grid[][] = new int[4][4];
		grid[0][0] = 1;
		grid[0][1] = 20;
		grid[0][2] = 15;
		grid[0][3] = 7;
		
		grid[1][0] = 70;
		grid[1][1] = 90;
		grid[1][2] = 50;
		grid[1][3] = 40;
		
		grid[1][0] = 5;
		grid[1][1] = 10;
		grid[1][2] = 15;
		grid[1][3] = 20;
		
		grid[1][0] = 9;
		grid[1][1] = 18;
		grid[1][2] = 27;
		grid[1][3] = 36;
		
		for(int row=0;row<grid.length;row++){
			for(int col =0;col<grid[row].length;col++){
				System.out.println(grid[row][col]);
			}
		}
		
		//Question 2
		/* Using the enum CaffeinatedBeverages as a base. Create a new enum
		 * called NonCaffeinatedBeverages, with at least three non-caffeinated beverages
		 * Additionally, create a copy of the switch statement that works with your enum
		 */
		
		CaffeinatedBeverages soda = CaffeinatedBeverages.Coke;
		switch(soda){
		case Coke:
			System.out.println("It's full of sugar");
			break;
		case Coffee:
			System.out.println("it's the best");
			break;
		case Tea:
			System.out.println("It's alright I guess");
			break;
		default:
			System.out.println("Never get here, above all the cases!");
		}
		
		NonCaffeinatedBeverages juice = NonCaffeinatedBeverages.Apple;
		switch(juice){
		case Apple:
			System.out.println("It's full of sugar");
			break;
		case Grape:
			System.out.println("it's the best");
			break;
		case Orange:
			System.out.println("It's alright I guess");
			break;
		default:
			System.out.println("Never get here, above all the cases!");
		}
		
		//Question 3
		/* Expand on the code below by calling every method in HoldsTwoVariables
		 * on the objects holder and secondHolder
		 * If a method returns a value, print the value
		 * If a method changes a member variable in one of the HoldsTwoVariable objects
		 * 		use toString() to print out the object.  
		 */
		HoldsTwoVariables holder = new HoldsTwoVariables();
		HoldsTwoVariables secondHolder = new HoldsTwoVariables(10,20);
		holder.setVariable1(3);
		holder.setVariable2(7);
		System.out.println("The bigger value is "+holder.getBigger());
		System.out.println("holder :"+holder.toString());
		holder.addOtherHolder(secondHolder);
		System.out.println("After adding--"+holder.toString());
		
		
		//This chunk calls all methods for secondHolder.
		secondHolder.setVariable1(3);
		secondHolder.setVariable2(7);
		System.out.println("The bigger value is "+secondHolder.getBigger());
		System.out.println("secondHolder :"+secondHolder.toString());
		secondHolder.addOtherHolder(new HoldsTwoVariables(90,99));
		System.out.println("After adding--"+secondHolder.toString());
		

		
		//Question 4
		/* Using HoldsTwoVariables as a base, Make a new Class called HoldsThreeVariables
		 * It's the same as HoldsTwoVariables, except it has three member variables
		 * 
		 * Also, the member variables cannot be named variable1, variable2, and variable3
		 * name them something different. 
		 * 
		 * Implement versions of all of the HoldsTwoVariable methods in HoldsThreeVariables but
		 * make adjustments for the fact there are now three variables
		 */
		
		//Question 5
		/* Create two HoldsThreeVariables objects. 
		 * One that uses the no-parameter constructor and one that uses the three-parameter constructor
		 * Call all of the methods you wrote in Question 4 on at least one of these objects
		 */
		
		HoldsThreeVariables triangle1 = new HoldsThreeVariables();
		HoldsThreeVariables triangle2 = new HoldsThreeVariables(1,1,1);
		
		triangle2.setLeg1(3);
		triangle2.setLeg2(4);
		triangle2.setHypotenuse(5);
		System.out.println("Leg 1: "+triangle2.getLeg1());
		System.out.println("Leg 2: "+triangle2.getLeg2());
		System.out.println("Hypotenuse: "+triangle2.getHypotenuse());
		System.out.println("The longest side is "+triangle2.getLongestSide());
		System.out.println("triangle2 :"+triangle2.toString());
		triangle2.addOtherSides(new HoldsThreeVariables(90,99,100));
		System.out.println("After adding--"+triangle2.toString());

	}

}
