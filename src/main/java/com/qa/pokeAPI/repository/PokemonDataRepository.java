package com.qa.pokeAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qa.pokeAPI.domain.pokemonData.PokemonData;

public interface PokemonDataRepository extends MongoRepository<PokemonData, String>
{

	public PokemonData findByName(String name);

	public PokemonData findByPokeId(int pokeId);

}
