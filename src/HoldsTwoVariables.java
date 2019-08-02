
public class HoldsTwoVariables {
	private int variable1;
	private int variable2;
	
	/**
	 * Default constructor
	 */
	public HoldsTwoVariables(){
		variable1 = 0;
		variable2 = 0;
	}
	
	public HoldsTwoVariables(int var1, int var2){
		variable1 = var1;
		variable2 = var2;
	}

	/**
	 * returns the bigger of the two variables
	 * @return
	 */
	public int getBigger(){
		if (variable1>variable2) {
			return variable1;
		} else {
			return variable2;
		}
	}
	
	/**
	 * adds the variable1 and variabl2 values to the variable1 and variable of this
	 * object.
	 * @param other
	 */
	public void addOtherHolder(HoldsTwoVariables other){
		variable1+=other.variable1;
		variable2+=other.variable2;
	}
	
	public int getVariable1() {
		return variable1;
	}

	public void setVariable1(int var) {
		variable1 = var;
	}

	public int getVariable2() {
		return variable2;
	}
	
	public void setVariable2(int var) {
		variable2 = var;
	}
	
	
	public String toString(){
		String rtnString = "The value of Variable 1 :"+variable1+", The value of variable 2:"+variable2;
		return rtnString;
	}

}
