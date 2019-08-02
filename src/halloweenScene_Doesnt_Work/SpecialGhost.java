package halloweenScene_Doesnt_Work;


public class SpecialGhost extends Actor{

	private int x,y;
	private Images img;
	private String filename;

	public SpecialGhost(int x, int y, String filename){
		super(x,y,filename);
		img = new Images(getX(),getY(),filename,1);
	}

	@Override
	public void move(CommandKeys key) {


	}

}
