package com.qa.pokeAPI.domain.pokemonData;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Moves
{
	private Move move;
	
	@JsonProperty("version_group_details")
	private List<VersionGroupDetail> versionGroupDetail;

	public Move getMove()
	{
		return move;
	}

	public void setMove(Move move)
	{
		this.move = move;
	}

	public List<VersionGroupDetail> getVersionGroupDetail()
	{
		return versionGroupDetail;
	}

	public void setVersionGroupDetail(List<VersionGroupDetail> versionGroupDetail)
	{
		this.versionGroupDetail = versionGroupDetail;
	}
	
	@Override
	public String toString()
	{
		return "Moves{" + move + ", version_group_details='" + versionGroupDetail + '\'' + '}';
	}
	
}
