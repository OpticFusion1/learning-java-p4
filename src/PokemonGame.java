
public class PokemonGame {

	/*
	 * ------|BULDING PROCESS OF POKEMON|------
	 * 1)
	 * 		I plan to make a base "Pokemon" becuase I want to take the object approach. This class
	 * 		will contain methods to get the Name, Type, HitPoints, Strength, and Defense of the 
	 * 		pokemon.
	 * 
	 * 2)
	 * 		Create a method to calculate the amount of hitpoints for each move. This will take 
	 * 		into account, both of the pokemon and its attributes.
	 * 
	 * 3)
	 * 		Create a loop that will run as long as the match is going. It will stop when one 
	 * 		pokemon DIES!
	 * 
	 * 4)
	 * 		Then a for loop will be made that will account for the turns of each player.
	 * 
	 * 5)
	 * 		Print out who won when the loop finishes.
	 */
	
	//This method will print out what move the pokemon did to the other pokemon.
	public static void attack(Pokemon poke1, Pokemon poke2, String move, int player){
		Magic.println(poke1.getName() +" used "+move+" on "+poke2.getName()+"!");
	}
	
	/*
	 * This method will calculate the amount of damge between the pokemon. It also tests to see if the pokemon type is
	 * weak to the attack type, therefore doubling the damage.
	 */
	public static int calculateDamage(Pokemon poke1, Pokemon poke2, Types moveType){
		int damage = 0;
		Types type1 = poke1.getType();
		Types type2 = poke2.getType();

		if(type1==moveType){
			damage = poke1.getStrength();
		}
		else{
			damage = poke1.getStrength()/2;
		}
		
		if(type2==Types.Fire && moveType==Types.Water){
			damage+=poke1.getStrength();
		}
		else if(type2==Types.Water && moveType==Types.Rock){
			damage+=poke1.getStrength();
		}
		else if(type2==Types.Rock && moveType==Types.Grass){
			damage+=poke1.getStrength();
		}
		else if(type2==Types.Grass && moveType==Types.Fire){
			damage+=poke1.getStrength();
		}
		
		if((damage-poke2.getDefense())<0){
			return 1;
		}
		return damage-poke2.getDefense();
	}

	public static void main(String[] args) {

		//This array will hold and keep track of the players with their pokemon.
		Pokemon[] players = new Pokemon[2];


		//This loop will create the pokemon for each player using their input.
		for(int i = 0; i < 2; i++){
			String name = "", type = "";
			Types actualType = Types.Fire;
			Magic.println("Player "+ (i+1) + ", please enter a name for your pokemon.");
			name = Magic.nextLine();

			boolean correct = true;

			while(correct){
				Magic.println("Now enter a type for your pokemon.");
				Magic.println("The types are: Fire | Water | Rock | Grass");
				type = Magic.nextLine().toLowerCase();
				
				//This switch block will check to make sure the type is spelled correctly.
				switch(type){
				case "fire":
					actualType = Types.Fire;
					correct = false;
					break;
				case "water":
					actualType = Types.Water;
					correct = false;
					break;
				case "rock":
					actualType = Types.Rock;
					correct = false;
					break;
				case "grass":
					actualType = Types.Grass;
					correct = false;
					break;
				}
			}

			players[i] = new Pokemon(name,actualType);
		}
		int round = 1;

		//This loop runs as long as both pokemon have hp above 0.
		while(players[0].getHealth() > 0 && players[1].getHealth() > 0){
			
			Types moveType1 = Types.Fire;
			Types moveType2 = Types.Fire;
			int move = 0;

			Magic.println("-----ROUND "+round+"-----");
			//These next two print statements print out the health and names of the Players' pokemon. 
			Magic.println(players[0].getName()+" hp is "+players[0].getHealth());
			Magic.println(players[1].getName()+" hp is "+players[1].getHealth());
			for(int i = 0; i < 2; i++){
				boolean turn = true;

				//This loop will control the player's turn
				while(turn){
					Magic.println("Player "+ (i+1)+ " what would you have "+players[i].getName()+" do?");
					Magic.println("Choose an attack: 1. Flare | 2. Bubble | 3. Grass Slice | 4. Rock | 5. Stats\nEnter the corresponding number.");

					move = Magic.nextInt();

					//This switch block will check that the move has been spelled right and then
					//assigns the type of the move to "moveType" to be used later. Also stores what
					//move was used to the pokemon who used it.
					switch(move){
					case 1: 
						if(i == 0){
							moveType1 = Types.Fire;
							}
							else{
								moveType2 = Types.Fire;
							}
						players[i].setMove("Flare");
						turn = false;
						break;
					case 2: 
						if(i == 0){
							moveType1 = Types.Water;
							}
							else{
								moveType2 = Types.Water;
							}
						players[i].setMove("Bubble");
						turn = false;
						break;
					case 3: 
						if(i == 0){
							moveType1 = Types.Grass;
							}
							else{
								moveType2 = Types.Grass;
							}
						players[i].setMove("Grass Slice");
						turn = false;
						break;
					case 4: 
						if(i == 0){
						moveType1 = Types.Rock;
						}
						else{
							moveType2 = Types.Rock;
						}
						players[i].setMove("Rock");
						turn = false;
						break;
					//This is an extra action to see stats of your pokemon; for debugging too.
					case 5:
						Magic.println("----STATS: "+players[i].getName()+" ----");
						Magic.println("Defense: "+players[i].getDefense()+"| Strength: "+players[i].getStrength()+ "| Health: "+players[i].getHealth()+"| Type: "+players[i].getType());
						break;
					}
				}
			}
			//This will play out the attack sequence for Player 1.
			attack(players[0],players[1],players[0].getMoveUsed(),1);
			int damage = calculateDamage(players[0],players[1],moveType1);
			players[1].hurt(damage);
		Magic.println("It caused "+damage+" damage!");
			
			//This will play out the attack sequence for Player 2.
			attack(players[1],players[0],players[1].getMoveUsed(),2);
			int damage2 = calculateDamage(players[1],players[0],moveType2);
			players[0].hurt(damage2);
			Magic.println("It caused "+damage2+" damage!");
			
			round++;
		}

		//This is the declaration of victory statements; depends on who wins.
		if(players[0].getHealth() <= 0){
			Magic.println("Player 1's pokemon: "+ players[0].getName()+ " is dead. Player 2's pokemon: "+ players[1].getName()+ " won!");
		}
		else{
			Magic.println("Player 2's pokemon: "+ players[1].getName()+ " is dead. Player 1's pokemon: "+ players[0].getName()+ " won!");
		}
	}

}
