package com.qa.pokeAPI.domain;

public class InputData {
	private String type;
	private String name;
	
	public InputData(String t, String n) {
		this.type = t;
		this.name = n;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
