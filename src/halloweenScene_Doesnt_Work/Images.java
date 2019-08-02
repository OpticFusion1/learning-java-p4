package halloweenScene_Doesnt_Work;




public class Images {
	private int x;
	private int y;
	private String filename;
	private int imageNumber;
	
	public int getX(){
		return this.x;
	}
	
	public void setX(int x){
		this.x = x;
	} 
	
	
	public Images(int newX, int newY, String newFileName, int newImageNumber ){
		x = newX;
		y = newY;
		filename =newFileName;
		imageNumber = newImageNumber;
		switch(imageNumber){
		case 1:
			Magic.setPosForImage1(x, y);
			Magic.setImage1(filename);
			break;
		case 2:
			Magic.setPosForImage2(x, y);
			Magic.setImage2(filename);
			break;
		case 3:
			Magic.setPosForImage3(x, y);
			Magic.setImage3(filename);
			break;
		default:
			Magic.println("ERROR");
		}
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		switch(imageNumber){
		case 1:
			Magic.setImage1(filename);
			break;
		case 2:
			Magic.setImage2(filename);
			break;
		case 3:
			Magic.setImage3(filename);
			break;
		default:
			Magic.println("ERROR");
		}
	}

	public void draw(){
		switch(imageNumber){
		case 1:
			Magic.setPosForImage1(x, y);
			break;
		case 2:
			Magic.setPosForImage2(x, y);
			break;
		case 3:
			Magic.setPosForImage3(x, y);
			break;
		default:
			Magic.println("ERROR");
		}
	}
	
	public void move(int deltaX, int deltaY){
		x+=deltaX;
		y+=deltaY;
		draw();
	}
}

//Dragons... Trogdor
