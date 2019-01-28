package com.qa.pokeAPI.domain.pokemonList;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonList
{
	@Id
	private int id;

	private int count;
	private List<PokemonListResult> results;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public List<PokemonListResult> getResults()
	{
		return results;
	}

	public void setResults(List<PokemonListResult> results)
	{
		this.results = results;
	}

}
