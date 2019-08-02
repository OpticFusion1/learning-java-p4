
public class Pokemon {
	
	private String name,move;
	private Types type;
	private int str, def,hp;
	
	public Pokemon(String name, Types type){
		this.name = name;
		this.type = type;
		hp = 50 + Magic.random(50);
		def = Magic.random(9)+1;
		str = 10 + Magic.random(10);
		move = "";
	}
	
	public String getName(){
		return name;
	}
	
	public Types getType(){
		return type;
	}
	
	public int getStrength(){
		return str;
	}
	
	public int getDefense(){
		return def;
	}
	
	public int getHealth(){
		return hp;
	}
	
	public String getMoveUsed(){
		return move;
	}
	
	public void setMove(String moveUsed){
		move = moveUsed;
	}
	
	public void hurt(int hitpoints){
		hp -= hitpoints;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
