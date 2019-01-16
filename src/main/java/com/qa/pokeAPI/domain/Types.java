package com.qa.pokeAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Types
{
	private int slot;
	private Type type;
	
	public int getSlot()
	{
		return slot;
	}
	public void setSlot(int slot)
	{
		this.slot = slot;
	}
	public Type getType()
	{
		return type;
	}
	public void setType(Type type)
	{
		this.type = type;
	}
	
	@Override
	public String toString()
	{
		return "Types{slot=" + slot + ", type='" + type + '\'' + '}';
	}
	
}
