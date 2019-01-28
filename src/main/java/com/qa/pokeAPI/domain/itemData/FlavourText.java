package com.qa.pokeAPI.domain.itemData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlavourText
{
	private Language language;
	private String test;
	@JsonProperty("version_group")
	private VersionGroup versionGroup;

	public Language getLanguage()
	{
		return language;
	}

	public void setLanguage(Language language)
	{
		this.language = language;
	}

	public String getTest()
	{
		return test;
	}

	public void setTest(String test)
	{
		this.test = test;
	}

	public VersionGroup getVersionGroup()
	{
		return versionGroup;
	}

	public void setVersionGroup(VersionGroup versionGroup)
	{
		this.versionGroup = versionGroup;
	}

}
