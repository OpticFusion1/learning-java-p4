package halloweenScene_Doesnt_Work;


public abstract class Actor {
	
	private int x,y;
	private Images img;
	private String filename;
	
	public Actor(int x,int y,String filename){
		this.x = x;
		this.y = y;
		this.filename = filename;
		
		img = new Images(x,y,filename,1);
		
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public String getFileName(){
		return filename;
	}


	public Images getImg() {
		return img;
	}

	public void setImg(Images img) {
		this.img = img;
	}
	
	public abstract void move(CommandKeys key);
	
}
