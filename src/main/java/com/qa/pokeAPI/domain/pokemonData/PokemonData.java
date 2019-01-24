package com.qa.pokeAPI.domain.pokemonData;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonData
{
	@Id
	private String id;
	
	private String name;
	private List<Abilities> abilities;
	@JsonProperty("base_experience")
	private int baseExperience;
	private List<Forms> forms;
	@JsonProperty("game_indices")
	private List<GameIndices> gameIndices;
	private int height;
	@JsonProperty("held_items")
	private List<HeldItems> heldItems;
	@JsonProperty("id")
	private int pokeId;
	@JsonProperty("is_default")
	private Boolean isDefault;
	@JsonProperty("location_area_encounters")
	private String locationEncounters;
	private List<Moves> moves;
	private int order;
	private Species species;
	private Sprites sprites;
	private List<Stats> stats;
	private List<Types> types;
	private int weight;
	
	

	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}

	public List<Abilities> getAbilities()
	{
		return abilities;
	}

	public void setAbilities(List<Abilities> abilities)
	{
		this.abilities = abilities;
	}

	public int getBaseExperience()
	{
		return baseExperience;
	}

	public void setBaseExperience(int baseExperience)
	{
		this.baseExperience = baseExperience;
	}

	public List<Forms> getForms()
	{
		return forms;
	}

	public void setForms(List<Forms> forms)
	{
		this.forms = forms;
	}

	public List<GameIndices> getGameIndices()
	{
		return gameIndices;
	}

	public void setGameIndices(List<GameIndices> gameIndices)
	{
		this.gameIndices = gameIndices;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public List<HeldItems> getHeldItems()
	{
		return heldItems;
	}

	public void setHeldItems(List<HeldItems> heldItems)
	{
		this.heldItems = heldItems;
	}

	public int getPokeId()
	{
		return pokeId;
	}

	public void setPokeId(int id)
	{
		this.pokeId = pokeId;
	}

	public Boolean getIsDefault()
	{
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault)
	{
		this.isDefault = isDefault;
	}

	public String getLocationEncounters()
	{
		return locationEncounters;
	}

	public void setLocationEncounters(String locationEncounters)
	{
		this.locationEncounters = locationEncounters;
	}

	public List<Moves> getMoves()
	{
		return moves;
	}

	public void setMoves(List<Moves> moves)
	{
		this.moves = moves;
	}
	

	public int getOrder()
	{
		return order;
	}


	public void setOrder(int order)
	{
		this.order = order;
	}


	public Species getSpecies()
	{
		return species;
	}


	public void setSpecies(Species species)
	{
		this.species = species;
	}


	public Sprites getSprites()
	{
		return sprites;
	}


	public void setSprites(Sprites sprites)
	{
		this.sprites = sprites;
	}

	

	public List<Stats> getStats()
	{
		return stats;
	}


	public void setStats(List<Stats> stats)
	{
		this.stats = stats;
	}

	public List<Types> getTypes()
	{
		return types;
	}


	public void setTypes(List<Types> types)
	{
		this.types = types;
	}
	
	


	public int getWeight()
	{
		return weight;
	}


	public void setWeight(int weight)
	{
		this.weight = weight;
	}


	public PokemonData()
	{
	}

	@Override
	public String toString()
	{
		return "PokemonData \n{" + "name='" + name + '\'' + ","
				+ "\n abilities='" + abilities + "',"
				+ "\n base_experience='" + baseExperience + "',"
				+ "\n forms='" + forms + "',"
				+ "\n game_indices='" + gameIndices + "', "
				+ "\n held_items='" + heldItems + "',"
				+ "\n pokeId='" + pokeId + "',"
				+ "\n isDefault=" + isDefault + "',"
				+ "\n location_area_encounters=" + locationEncounters + "',"
				+ "\n height='" + height + "',"
				+ "\n moves='" + moves + "',"
				+ "\n order='" + order + "',"
				+ "\n species='" + species + "',"
				+ "\n stats='" + stats + "',"
				+ "\n types='" + types + "',"
				+ "\n weight='" + weight + "'}";
	}
	
	
	public String prettyString()
	{
		return "Nothing yet";
	}
}
