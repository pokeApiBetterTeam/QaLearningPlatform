package com.qa.pokeAPI.domain;

public class Version
{
	String name;
	String url;
	
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
		return "Version{" + "name=" + name + ", URL='" + url + '\'' + '}';
	}
	
}
