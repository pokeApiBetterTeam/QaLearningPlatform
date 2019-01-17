package com.qa.pokeAPI.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonData
{
	private String name;
	private List<Abilities> abilities;
	
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


	public PokemonData()
	{
	}


	@Override
	public String toString()
	{
		return "PokemonData{" + "name='" + name + '\'' + ", abilities=" + abilities + '}';
	}
}
