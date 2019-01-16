package com.qa.pokeAPI.domain;

public class Forms
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
		return "Form{" + "name=" + name + ", URL='" + url + '\'' + '}';
	}

}
