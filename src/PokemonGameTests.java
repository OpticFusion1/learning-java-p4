import static org.junit.Assert.*;

import org.junit.Test;


public class PokemonGameTests {
	
	//Tests the 'calculateDamage' method.
	@Test
	public void testCalculateDamage() {
		//Creating two pokemon with hard coded values for testing.
		Pokemon poke1 = new Pokemon("leaf",Types.Grass);
		poke1.setHp(50);
		poke1.setStr(14);
		poke1.setDef(10);
		
		Pokemon poke2 = new Pokemon("burn",Types.Fire);
		poke2.setHp(50);
		poke2.setStr(14);
		poke2.setDef(10);
		
		//This checks for 'poke1' attacking 'poke2'.
		assertTrue("Didn't calculate correctly.",PokemonGame.calculateDamage(poke1, poke2, Types.Water)==11);
		assertTrue("Didn't calculate correctly.",PokemonGame.calculateDamage(poke1, poke2, Types.Grass)==4);

		//This checks for 'poke2' attacking 'poke1'.
		assertTrue("Didn't calculate correctly.",PokemonGame.calculateDamage(poke2, poke1, Types.Water)==1);
		assertTrue("Didn't calculate correctly.",PokemonGame.calculateDamage(poke2, poke1, Types.Fire)==18);

	}

}
