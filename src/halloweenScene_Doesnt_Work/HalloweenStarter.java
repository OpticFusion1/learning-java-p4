package halloweenScene_Doesnt_Work;
import javax.swing.Timer;


public class HalloweenStarter {

	public static void main(String[] args) {
		Halloween hallow = new Halloween();
		Timer time = new Timer(30,hallow);
		time.start();

	}

}
