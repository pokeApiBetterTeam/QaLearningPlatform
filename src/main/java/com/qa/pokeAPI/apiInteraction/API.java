package com.qa.pokeAPI.apiInteraction;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.qa.pokeAPI.domain.PokemonData;
import com.qa.pokeAPI.repository.PokemonRepository;

@Service
public class API
{
	@Autowired
	private PokemonRepository repository;
	
	public PokemonData GetPokemonByName(String pokemonName)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<PokemonData> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/" + pokemonName + "/", HttpMethod.GET, entity, PokemonData.class);
        
        repository.save(response.getBody());
        return response.getBody();
	}
}
