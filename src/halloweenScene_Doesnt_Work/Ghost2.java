package halloweenScene_Doesnt_Work;

public class Ghost2 extends Actor {

	private int x,y;
	private Images img;
	private String filename;

	public Ghost2(int x, int y, String filename){
		super(x,y,filename);
		img = new Images(getX(),getY(),filename,1);
	}

	/**
	 * This method will move only this ghost for the keys J,K,I,L.
	 */
	@Override
	public void move(CommandKeys key) {

		switch(key){
		case J:
			x--;
			img.move(x,y);
			break;
		case I:
			y--;
			img.move(x,y);
			break;
		case K:
			y++;
			img.move(x,y);
			break;
		case L:
			x++;
			img.move(x,y);
		}

	}

}
