package com.qa.pokeAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats
{
	@JsonProperty("base_stat")
	private int baseStat;
	private int effort;
	private Stat stat;
	
	public int getBaseStat()
	{
		return baseStat;
	}
	public void setBaseStat(int baseStat)
	{
		this.baseStat = baseStat;
	}
	public int getEffort()
	{
		return effort;
	}
	public void setEffort(int effort)
	{
		this.effort = effort;
	}
	public Stat getStat()
	{
		return stat;
	}
	public void setStat(Stat stat)
	{
		this.stat = stat;
	}
	
	@Override
	public String toString()
	{
		return "\n Stats{" + "base_stat=" + baseStat + ", effort='" + effort + ", stat='" + stat + "'}";
	}
}
