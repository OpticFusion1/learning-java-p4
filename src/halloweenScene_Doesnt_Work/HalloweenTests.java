package halloweenScene_Doesnt_Work;
import static org.junit.Assert.*;

import org.junit.Test;


public class HalloweenTests {

	@Test
	public void testGhost1Movement() {
		Ghost1 g1 = new Ghost1(0,0,"");
		
		//Move left 1.
		g1.move(CommandKeys.A);
		assertTrue("Didn't move correctly.",g1.getX()==-1);
	}

}
