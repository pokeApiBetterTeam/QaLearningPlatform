package com.qa.pokeAPI.domain;


import javax.ws.rs.Produces;
import javax.inject.*;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputDataRestController {
	@Inject
	private InputData input;
	
	@Produces({ "application/json"})
	public String getInputData() {
		input.getType();
		input.getName();
		return JSONObject.quote("Type:" input.getType();,"Name:" +input.getName());
		
		
		
	}

}
