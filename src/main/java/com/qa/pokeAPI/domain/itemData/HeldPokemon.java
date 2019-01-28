package com.qa.pokeAPI.domain.itemData;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qa.pokeAPI.domain.pokemonData.VersionDetails;

public class HeldPokemon
{
	private Pokemon pokemon;
	@JsonProperty("version_details")
	private VersionDetails versionDetails;

	public Pokemon getPokemon()
	{
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon)
	{
		this.pokemon = pokemon;
	}

	public VersionDetails getVersionDetails()
	{
		return versionDetails;
	}

	public void setVersionDetails(VersionDetails versionDetails)
	{
		this.versionDetails = versionDetails;
	}

}
