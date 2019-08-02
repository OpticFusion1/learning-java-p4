import java.util.Scanner;
import javax.swing.Timer;

public class Starter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Fraction firstFrac = new Fraction(2,3);
		
		//Prints out 'firstFrac' to see a change when it has been added to.
		System.out.println("firstFrac before being added to: "+ firstFrac.toString());
		
		//Adds "3/4" to 'firstFrac'(2/3).
		firstFrac.addTo(new Fraction(3,4));
		
		//Prints out 'firstFrac' after it has been added to by "3/4".
		System.out.println("firstFrac after: "+firstFrac.toString());
		
		
		Fraction secondFrac = new Fraction(5,2);
		
		//Prints out 'secondFrac' before its added to.
		System.out.println("secondFrac before being adding: "+ secondFrac.toString());
		
		//Adds another fraction (2/1) to 'secondFrac' and prints out the result.
		Fraction newFrac = secondFrac.add(new Fraction(2,1));
		System.out.println("New fraction from secondFrac: "+newFrac.toString());
		
		//Creates a new Grid object to later create the grid of colored Squares.
		System.out.println("How many rows of colored squares do you want?");
		int rows = scan.nextInt();
		
		System.out.println("How many coloumns of colored squares do you want?");
		int cols = scan.nextInt();
		scan.nextLine();
		
		Grid grid = new Grid(rows,cols);
		
		//Creates the list that will contain the colors for the squares.
		String[][] squaresList = grid.createGrid();
		
		//This block of loops will create the colored square grid.
		int x=0,y=0;
		for(int row = 0; row < squaresList.length; row++){
			for(int col = 0; col < squaresList[0].length; col++){
				Magic.drawRectangle(x, y, 50, 50, squaresList[row][col]);
				x+=50;
			}
			//These commands move the row down one square and restarts the x postion.
			y+=50;
			x = 0;
		}
		
	}

}
