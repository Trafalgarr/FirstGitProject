package projet1;

public class Pokemon {
	String	pokemonRace;
	String	surname;
	int		pvMax;
	int		pvNow;
	
	public	Pokemon(){
		pokemonRace = "unknown";
		surname = "unknown";
		pvMax = 1;
		pvNow = 1;
	}
	
	public Pokemon(String datPokemonRace, String datSurname, int datPvMax, int datPvNow){
		pokemonRace = datPokemonRace;
		surname = datSurname;
		pvMax = datPvMax;
		pvNow = datPvNow;
	}
	
	public void WhoIsThatPokemon(){
		System.out.println(pokemonRace);
	}
}
