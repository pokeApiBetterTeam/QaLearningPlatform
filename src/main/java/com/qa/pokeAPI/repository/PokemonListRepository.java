package com.qa.pokeAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qa.pokeAPI.domain.pokemonList.PokemonList;

public interface PokemonListRepository extends MongoRepository<PokemonList, String>
{
	public PokemonList findById(int Id);
}
