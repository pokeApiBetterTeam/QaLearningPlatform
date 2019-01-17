package com.qa.pokeAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qa.pokeAPI.domain.PokemonData;

public interface PokemonRepository extends MongoRepository<PokemonData, String>
{

	public PokemonData findByName(String name);

	public PokemonData findByPokeId(int pokeId);

}
