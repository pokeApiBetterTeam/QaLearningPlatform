package com.qa.pokeAPI.domain.pokemonData;

public class VersionDetails
{
	int rarity;
	Version version;
	
	public int getRarity()
	{
		return rarity;
	}
	public void setRarity(int rarity)
	{
		this.rarity = rarity;
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
		return "\n VersionDetails{" + "rarity=" + rarity + ", version='" + version + '\'' + '}';
	}
}
