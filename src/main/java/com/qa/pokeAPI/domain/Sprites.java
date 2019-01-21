package com.qa.pokeAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sprites
{
	@JsonProperty("back_default")
	private String backDefault;
	
	@JsonProperty("back_female")
	private String backFemale;
	
	@JsonProperty("back_shiny")
	private String backShiny;
	
	@JsonProperty("back_shiny_female")
	private String backShinyFemale;
	
	@JsonProperty("front_default")
	private String frontDefault;
	
	@JsonProperty("front_female")
	private String frontFemale;
	
	@JsonProperty("front_shiny")
	private String frontShiny;
	
	@JsonProperty("front_shiny_female")
	private String frontShinyFemale;

	public String getBackDefault()
	{
		return backDefault;
	}

	public void setBackDefault(String backDefault)
	{
		this.backDefault = backDefault;
	}

	public String getBackFemale()
	{
		return backFemale;
	}

	public void setBackFemale(String backFemale)
	{
		this.backFemale = backFemale;
	}

	public String getBackShiney()
	{
		return backShiny;
	}

	public void setBackShiney(String backShiney)
	{
		this.backShiny = backShiney;
	}

	public String getBackShineyFemale()
	{
		return backShinyFemale;
	}

	public void setBackShineyFemale(String backShineyFemale)
	{
		this.backShinyFemale = backShineyFemale;
	}

	public String getFrontDefault()
	{
		return frontDefault;
	}

	public void setFrontDefault(String frontDefault)
	{
		this.frontDefault = frontDefault;
	}

	public String getFrontFemale()
	{
		return frontFemale;
	}

	public void setFrontFemale(String frontFemale)
	{
		this.frontFemale = frontFemale;
	}

	public String getFrontShiney()
	{
		return frontShiny;
	}

	public void setFrontShiney(String frontShiney)
	{
		this.frontShiny = frontShiney;
	}

	public String getFrontShineyFemale()
	{
		return frontShinyFemale;
	}

	public void setFrontShineyFemale(String frontShineyFemale)
	{
		this.frontShinyFemale = frontShineyFemale;
	}
	
	@Override
	public String toString()
	{
		return "Sprites{" + "\n back_default='" + backDefault + "',\n beck_female='" + backFemale + ",\n back_shiney='" + backShiny+ ",\n back_shiney_female='" + backShinyFemale 
				+ ",\n front_default='" + frontDefault + ",\n front_female='" + frontFemale + ",\n front_shiney='" + frontShiny + ",\n front_shiney_female='" + frontShinyFemale + '\'' + '}';
	}
}
