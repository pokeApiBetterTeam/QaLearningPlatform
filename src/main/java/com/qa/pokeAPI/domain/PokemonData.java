package com.qa.pokeAPI.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonData
{
	private String name;
	private List<Ability> abilities;
	
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}
	

	public List<Ability> getAbilities()
	{
		return abilities;
	}


	public void setAbilities(List<Ability> abilities)
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
