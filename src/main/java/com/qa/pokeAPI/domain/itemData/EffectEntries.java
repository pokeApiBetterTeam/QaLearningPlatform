package com.qa.pokeAPI.domain.itemData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EffectEntries
{
	private String effect;
	private Language language;
	@JsonProperty("short_effect")
	private String shortEffect;
	
	public String getEffect()
	{
		return effect;
	}
	public void setEffect(String effect)
	{
		this.effect = effect;
	}
	public Language getLanguage()
	{
		return language;
	}
	public void setLanguage(Language language)
	{
		this.language = language;
	}
	public String getShortEffect()
	{
		return shortEffect;
	}
	public void setShortEffect(String shortEffect)
	{
		this.shortEffect = shortEffect;
	}
	
	
}
