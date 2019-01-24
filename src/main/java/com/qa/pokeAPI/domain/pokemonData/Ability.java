package com.qa.pokeAPI.domain.pokemonData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ability
{
	
	@JsonProperty("name")
	String name;
	@JsonProperty("url")
	String uRL;
	
	public Ability()
	{
		
	}
	
	public Ability(String name, String uRL)
	{
		this.name = name;
		this.uRL = uRL;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getURL()
	{
		return uRL;
	}
	public void setURL(String uRL)
	{
		this.uRL = uRL;
	}
	
	@Override
	public String toString()
	{
		return "Ability{" + "name=" + name + ", URL='" + uRL + '\'' + '}';
	}
	
}
