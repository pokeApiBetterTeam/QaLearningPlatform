package com.qa.pokeAPI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.qa.pokeAPI.domain.PokemonData;
import com.qa.pokeAPI.repository.PokemonRepository;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	@Autowired
	private PokemonRepository repository;

	public static void main(String args[]) 
    {
		SpringApplication.run(Application.class, args);
    }
	
	@Override
	public void run(String... args) throws Exception
	{
		
			repository.deleteAll();
			
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

	        ResponseEntity<PokemonData> response = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/pikachu/", HttpMethod.GET, entity, PokemonData.class);
	        
	        repository.save(response.getBody());
	        
	        System.out.println("Pokemon Data found \n -----------------------");
	        
	        for(PokemonData pokemonData : repository.findAll())
	        {
	        	//System.out.println("PokemonData : \n " + pokemonData);
	        }
	}

}