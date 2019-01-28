package com.qa.pokeAPI.domain.itemData;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qa.pokeAPI.domain.pokemonData.GameIndices;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemData
{
	@Id
	private int id;

	private String name;
	private List<Attributes> attributes;
	@JsonProperty("baby_trigger_for")
	private String babyTriggerFor;
	private Category category;
	private int cost;
	@JsonProperty("effect_entries")
	private List<EffectEntries> effectEntries;
	@JsonProperty("flavour_test_entries")
	private List<FlavourText> flavourTest;
	@JsonProperty("fling_effect")
	private FlingEffect flingEffect;
	@JsonProperty("fling_power")
	private int flingPower;
	@JsonProperty("game_indices")
	private List<GameIndices> gameIndices;
	@JsonProperty("held_by_pokemon")
	private List<HeldPokemon> heldPokemon;
	@JsonProperty("id")
	private int itemId;
	private List<Machines> machines;
	private List<Names> names;
	private Sprites sprites;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public List<Attributes> getAttributes()
	{
		return attributes;
	}

	public void setAttributes(List<Attributes> attributes)
	{
		this.attributes = attributes;
	}

	public String getBabyTriggerFor()
	{
		return babyTriggerFor;
	}

	public void setBabyTriggerFor(String babyTriggerFor)
	{
		this.babyTriggerFor = babyTriggerFor;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public List<EffectEntries> getEffectEntries()
	{
		return effectEntries;
	}

	public void setEffectEntries(List<EffectEntries> effectEntries)
	{
		this.effectEntries = effectEntries;
	}

	public List<FlavourText> getFlavourTest()
	{
		return flavourTest;
	}

	public void setFlavourTest(List<FlavourText> flavourTest)
	{
		this.flavourTest = flavourTest;
	}

	public FlingEffect getFlingEffect()
	{
		return flingEffect;
	}

	public void setFlingEffect(FlingEffect flingEffect)
	{
		this.flingEffect = flingEffect;
	}

	public int getFlingPower()
	{
		return flingPower;
	}

	public void setFlingPower(int flingPower)
	{
		this.flingPower = flingPower;
	}

	public List<GameIndices> getGameIndices()
	{
		return gameIndices;
	}

	public void setGameIndices(List<GameIndices> gameIndices)
	{
		this.gameIndices = gameIndices;
	}

	public List<HeldPokemon> getHeldPokemon()
	{
		return heldPokemon;
	}

	public void setHeldPokemon(List<HeldPokemon> heldPokemon)
	{
		this.heldPokemon = heldPokemon;
	}

	public int getItemID()
	{
		return itemId;
	}

	public void setItemID(int itemID)
	{
		this.itemId = itemID;
	}

	public List<Machines> getMachines()
	{
		return machines;
	}

	public void setMachines(List<Machines> machines)
	{
		this.machines = machines;
	}

	public List<Names> getNames()
	{
		return names;
	}

	public void setNames(List<Names> names)
	{
		this.names = names;
	}

	public Sprites getSprites()
	{
		return sprites;
	}

	public void setSprites(Sprites sprites)
	{
		this.sprites = sprites;
	}

}
