package halloweenScene_Doesnt_Work;


public class Ghost1 extends Actor {
	
	private int x,y;
	private Images img;
	private String filename;
	
	public Ghost1(int x, int y, String filename){
		super(x,y,filename);
		img = new Images(getX(),getY(),filename,1);
	}
	
	/**
	 * This method will move only this ghost for the keys A,S,W,D.
	 */
	@Override
	public void move(CommandKeys key) {
		
		switch(key){
		case A:
			x--;
			img.move(x,y);
			break;
		case W:
			y--;
			img.move(x,y);
			break;
		case S:
			y++;
			img.move(x,y);
			break;
		case D:
			x++;
			img.move(x,y);
		}

	}

}
