package com.qa.interoperability;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.pokeAPI.apiInteraction.API;
import com.qa.pokeAPI.domain.PokemonData;
import com.qa.pokeAPI.repository.PokemonRepository;

@Transactional
@RequestMapping("/PokemonData")
@RestController
public class DataController
{
	
	@Autowired
	PokemonRepository pokemonRepository;
	
	@Autowired
	API apiInteractions;
	
	@GetMapping(value = "/{name}")
	public ResponseEntity<PokemonData> GetPokemonData(@PathVariable("name") String name)
	{
		System.out.println("GetTriggered");
		PokemonData retrievedData;
		
		if(pokemonRepository.findByName(name) == null)
		{
			retrievedData = apiInteractions.GetPokemonByName(name);
			System.out.println("getting from API");
		}
		else
		{
			retrievedData = pokemonRepository.findByName(name);
			System.out.println("found in DB");
		}
		
		
		return new ResponseEntity<PokemonData>(retrievedData, HttpStatus.OK);
	}
	
	@GetMapping(value = "/")
	public ResponseEntity<String> TestGet()
	{
		System.out.println("GetTriggered");
		return new ResponseEntity<String>("Test Get Worked", HttpStatus.OK);
	}
	
}
