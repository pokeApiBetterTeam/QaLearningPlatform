package com.qa.pokeAPI.domain.itemData;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Machines
{
	private Machine machine;
	@JsonProperty("version_group")
	private VersionGroup versionGroup;

	public Machine getMachine()
	{
		return machine;
	}

	public void setMachine(Machine machine)
	{
		this.machine = machine;
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
