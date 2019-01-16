package com.qa.pokeAPI.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeldItems
{
	private Item item;
	
	@JsonProperty("version_details")
	private List<VersionDetails> versionDetails;
	
	public Item getItem()
	{
		return item;
	}
	public void setItem(Item item)
	{
		this.item = item;
	}
	public List<VersionDetails> getVersionDetails()
	{
		return versionDetails;
	}
	public void setVersionDetails(List<VersionDetails> versionDetails)
	{
		this.versionDetails = versionDetails;
	}
	
	@Override
	public String toString()
	{
		return "\n HeldItem{" + "Item=" + item + ", VersionDetails='" + versionDetails + '\'' + '}';
	}
	
}
