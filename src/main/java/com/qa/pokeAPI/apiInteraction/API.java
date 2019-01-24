package com.qa.pokeAPI.apiInteraction;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qa.pokeAPI.domain.pokemonData.PokemonData;
import com.qa.pokeAPI.domain.pokemonList.PokemonList;
import com.qa.pokeAPI.repository.PokemonDataRepository;
import com.qa.pokeAPI.repository.PokemonListRepository;

@Service
public class API
{
	@Autowired
	private PokemonDataRepository dataRepository;
	
	@Autowired
	private PokemonListRepository pokemonList;
	
	RestTemplate restTemplate = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();
	HttpEntity<String> entity;
	
	public API()
	{	
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        entity = new HttpEntity<String>("parameters", headers);
	}
	
	public PokemonData GetPokemonByName(String pokemonName)
	{	
        ResponseEntity<PokemonData> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/" + pokemonName + "/", HttpMethod.GET, entity, PokemonData.class);
        
        dataRepository.save(response.getBody());
        return response.getBody();
	}
	
	public int GetNumOfPokemon()
	{
		ResponseEntity<PokemonList> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/", HttpMethod.GET, entity, PokemonList.class);
		return response.getBody().getCount();
	}
	
	public PokemonList GetListOfPokemon(int limit)
	{
		ResponseEntity<PokemonList> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/?limit=" + limit, HttpMethod.GET, entity, PokemonList.class);
		pokemonList.save(response.getBody());
		return response.getBody();
		
	}
}
