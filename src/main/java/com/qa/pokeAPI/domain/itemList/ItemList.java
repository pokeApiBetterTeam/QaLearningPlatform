package com.qa.pokeAPI.domain.itemList;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemList
{
	@Id
	private int id;

	private int count;
	private List<ItemListResult> results;

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

	public List<ItemListResult> getResults()
	{
		return results;
	}

	public void setResults(List<ItemListResult> results)
	{
		this.results = results;
	}

}