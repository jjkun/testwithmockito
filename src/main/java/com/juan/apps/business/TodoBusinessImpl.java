package com.juan.apps.business;

import java.util.ArrayList;
import java.util.List;

import com.juan.apps.api.TodoService;

//TodoBusinessImpl SUT (System Under Test)
//TodoService Dependency
public class TodoBusinessImpl{

	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String users){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = this.todoService.retrieveTodos(users);
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
