
public class HoldsThreeVariables {

	private int leg1, leg2, hypotenuse;

	public HoldsThreeVariables(){
		leg1 = 1;
		leg2 = 1;
		hypotenuse = 2;
	}

	public HoldsThreeVariables(int leg1, int leg2, int hypotenuse){
		this.leg1 = leg1;
		this.leg2 = leg2;
		this.hypotenuse = hypotenuse;
	}

	/**
	 * Returns the longest side.
	 */
	public int getLongestSide(){
		if(hypotenuse > leg1 && hypotenuse > leg2){
			return hypotenuse;
		} else if(leg1 > leg2){
			return leg1;
		} else{
			return leg2;
		}
	}
	
	/**
	 * adds the sides of this holder to the sides of the other
	 * object.
	 * @param other
	 */
	public void addOtherSides(HoldsThreeVariables other){
		leg1 += other.getLeg1();
		leg2 += other.getLeg2();
		hypotenuse += other.getHypotenuse();
	}
	
	public String toString(){
		String message = "";
		message += "Leg 1: "+leg1+" Leg 2: "+leg2+" Hypotenuse: "+hypotenuse;
		return message;
	}

	public int getLeg1(){
		return leg1;
	}

	public int getLeg2(){
		return leg2;
	}

	public int getHypotenuse(){
		return hypotenuse;
	}

	public void setLeg1(int leg1){
		this.leg1 = leg1;
	}

	public void setLeg2(int leg2){
		this.leg2 = leg2;
	}

	public void setHypotenuse(int hypotenuse){
		this.hypotenuse = hypotenuse;
	}


}
