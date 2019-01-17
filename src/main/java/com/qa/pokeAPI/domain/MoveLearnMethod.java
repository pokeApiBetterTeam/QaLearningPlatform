package com.qa.pokeAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoveLearnMethod
{
	private String name;
	private String url;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	@Override
	public String toString()
	{
		return "\n MoveLearnMethod{" + "name=" + name + ", URL='" + url + '\'' + '}';
	}
}