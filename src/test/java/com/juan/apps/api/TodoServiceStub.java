package com.juan.apps.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
	
	//Dynamic conditions
	//Service Definition

	public List<String> retrieveTodos(String users) {
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance");
	}

}
