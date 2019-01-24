package com.qa.pokeAPI.interoperability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.qa.pokeAPI.apiInteraction.API;
import com.qa.pokeAPI.domain.pokemonData.PokemonData;
import com.qa.pokeAPI.domain.pokemonList.PokemonList;
import com.qa.pokeAPI.repository.PokemonDataRepository;
import com.qa.pokeAPI.repository.PokemonListRepository;

@RestController
public class DataController
{

	@Autowired
	PokemonDataRepository pokemonRepository;

	@Autowired
	PokemonListRepository pokemonList;

	@Autowired
	API apiInteractions;

	@GetMapping(value = "/PokemonName/{name}")
	public ResponseEntity<PokemonData> GetPokemonData(@PathVariable("name") String name)
	{
		System.out.println("GetTriggered");
		PokemonData retrievedData;

		if (pokemonRepository.findByName(name) == null)
		{
			retrievedData = apiInteractions.GetPokemonByName(name);
			System.out.println("getting from API");
		} else
		{
			retrievedData = pokemonRepository.findByName(name);
			System.out.println("found in DB");
		}

		return new ResponseEntity<PokemonData>(retrievedData, HttpStatus.OK);
	}

	@GetMapping(value = "/AllPokemon")
	public ResponseEntity<PokemonList> GetAllPokemon()
	{
		System.out.println("GetTriggered");
		PokemonList retrievedData;

		if (pokemonList.findById(0) == null)
		{
			int searchLimit = apiInteractions.GetNumOfPokemon();
			retrievedData = apiInteractions.GetListOfPokemon(searchLimit);

			System.out.println("getting pokemonList from API");
		} else
		{
			retrievedData = pokemonList.findById(0);
			System.out.println("found in DB");
		}

		return new ResponseEntity<PokemonList>(retrievedData, HttpStatus.OK);
	}

}
