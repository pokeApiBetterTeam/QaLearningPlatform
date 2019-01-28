package com.qa.pokeAPI.domain.itemData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprites
{
	@JsonProperty("default")
	private String defaultSprite;

	public String getDefaultSprite()
	{
		return defaultSprite;
	}

	public void setDefaultSprite(String defaultSprite)
	{
		this.defaultSprite = defaultSprite;
	}
	
	
}
