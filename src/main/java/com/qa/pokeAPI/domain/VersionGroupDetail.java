package com.qa.pokeAPI.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGroupDetail
{
	@JsonProperty("level_learned_at")
	private int levelLearnedAt;
	@JsonProperty("move_learn_method")
	private MoveLearnMethod moveLearnMethod;
	@JsonProperty("version_group")
	private Version version;
	
	public int getLevelLernedAt()
	{
		return levelLearnedAt;
	}
	public void setLevelLernedAt(int levelLernedAt)
	{
		this.levelLearnedAt = levelLernedAt;
	}
	public MoveLearnMethod getMoveLearnMethod()
	{
		return moveLearnMethod;
	}
	public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod)
	{
		this.moveLearnMethod = moveLearnMethod;
	}
	public Version getVersion()
	{
		return version;
	}
	public void setVersion(Version version)
	{
		this.version = version;
	}
	
	@Override
	public String toString()
	{
		return "\n VersionGroupDetail{level_learned_at='" + levelLearnedAt + "', move_learn_method='" + moveLearnMethod + "', version_group ='" + version + "'}";
	}
	
}
