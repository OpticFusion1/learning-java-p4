import java.util.Scanner;

public class Grid {

	private int rows,cols;

	public Grid(){
		rows = 0;
		cols = 0;
	}

	public Grid(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
	}

	public int getRows(){
		return rows;
	}

	public int getCols(){
		return cols;
	}

	public String[][] createGrid(){
		Scanner scan = new Scanner(System.in);
		String[][] data = new String[rows][cols];

		for(int row = 0; row < rows; row++){
			for(int col = 0; col < cols; col++){
				boolean check = true;

				//This loop checks to see if the color entered was correct
				while(check){
					System.out.println("For ["+row+"]"+"["+col+"]"+" please enter a color: Red Blue Green Black.");
					String color = scan.nextLine();
					if(color.equalsIgnoreCase("red")){
						data[row][col] = color.toLowerCase();
						check = false;
					}else if(color.equalsIgnoreCase("blue")){
						data[row][col] = color.toLowerCase();
						check = false;
					}else if(color.equalsIgnoreCase("green")){
						data[row][col] = color.toLowerCase();
						check = false;
					}else if(color.equalsIgnoreCase("black")){
						data[row][col] = color.toLowerCase();
						check = false;
					}

				}
			}
		}
		
		scan.close();
		return data;
	}

}
