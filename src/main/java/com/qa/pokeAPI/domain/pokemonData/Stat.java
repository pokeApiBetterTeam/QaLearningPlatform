package com.qa.pokeAPI.domain.pokemonData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stat
{
	private String name;
	private String url;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	@Override
	public String toString()
	{
		return "Stat{" + "name=" + name + ", URL='" + url + '\'' + '}';
	}
	
}
