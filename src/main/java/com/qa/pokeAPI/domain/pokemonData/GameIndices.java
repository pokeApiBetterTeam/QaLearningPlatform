package com.qa.pokeAPI.domain.pokemonData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GameIndices
{
	@JsonProperty("game_index")
	int gameIndex;
	Version version;
	
	
	
	public int getGameIndex()
	{
		return gameIndex;
	}



	public void setGameIndex(int gameIndex)
	{
		this.gameIndex = gameIndex;
	}



	public Version getVersion()
	{
		return version;
	}



	public void setVersion(Version version)
	{
		this.version = version;
	}



	@Override
	public String toString()
	{
		return "\n GameIndices{" + "game_index=" + gameIndex + ", version='" + version + '\'' + '}';
	}
}
