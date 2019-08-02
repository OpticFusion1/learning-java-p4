
public class Fraction {

	private int num, den;

	public Fraction(){
		num = 1;
		den = 1;
	}

	public Fraction(int num, int den){
		this.num = num;

		if(den == 0){
			this.den = 1;
		}else{
			this.den = den;
		}
	}
	
	public int getNum(){
		return num;
	}
	
	public int getDen(){
		return den;
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void setDen(int den){
		if(den != 0){
			this.den = den;
		}else{
			den = 1;
		}
	}
	
	public String toString(){
		return num+"/"+den;
	}
	
	/**
	 * Adds a fraction to this fraction.
	 * @param = Another fraction.
	 */
	public void addTo(Fraction otherFraction){
		int tempDen = 0;
		if(den != otherFraction.getDen()){
			tempDen = den;
			den *= otherFraction.getDen();
			
			num = (num * otherFraction.getDen())+(otherFraction.getNum()*tempDen);
		}else{
			num += otherFraction.getNum();
		}
	}
	
	/**
	 * Adds a fraction to this fraction and returns a new fraction without changing the fraction 
	 * being added to.
	 * @param = Another fraction.
	 */
	public Fraction add(Fraction otherFraction){
		Fraction frac1 = new Fraction();
		int tempDen = 0;
		if(den != otherFraction.getDen()){
			tempDen = otherFraction.getDen();
			frac1.setDen(den *otherFraction.getDen());
			
			frac1.setNum((num * tempDen)+(otherFraction.getNum()*den));
		}else{
			frac1.setNum(num + otherFraction.getNum());
		}
		
		return frac1;
	}
}
