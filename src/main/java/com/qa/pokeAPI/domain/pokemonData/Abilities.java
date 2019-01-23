package com.qa.pokeAPI.domain.pokemonData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Abilities
{
	private Ability ability;
	
	@JsonProperty("is_hidden")
	private Boolean isHidden;
	private int slot;
	
	public Ability getAbility()
	{
		return ability;
	}
	public void setAbility(Ability ability)
	{
		this.ability = ability;
	}
	public Boolean getIsHidden()
	{
		return isHidden;
	}
	public void setIsHidden(Boolean isHidden)
	{
		this.isHidden = isHidden;
	}
	public int getSlot()
	{
		return slot;
	}
	public void setSlot(int slot)
	{
		this.slot = slot;
	}
	
	
	@Override
	public String toString()
	{
		return "\n{" + "name=" + ability + ", is_hidden=" + isHidden + ", slot='" + slot + '\'' + '}';
	}
	
}
