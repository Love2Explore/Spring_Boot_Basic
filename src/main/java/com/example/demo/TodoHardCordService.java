package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCordService {
  private static List<Todo> todos = new ArrayList<Todo>();
  private static int id = 0;
  static {
	  todos.add(new Todo( ++id , "rewati", "Learn Python" ,false, new Date() ,new Date() ));
	  todos.add(new Todo( ++id , "rewati", "Learn ML" ,false, new Date() ,new Date() ));
	  todos.add(new Todo( ++id , "rewati", "Learn AI" ,false, new Date() ,new Date() ));
	  todos.add(new Todo( ++id , "rewati", "Learn BTP" ,false, new Date() ,new Date() ));
	  todos.add(new Todo( ++id , "rewati", "Learn Spring" ,false, new Date() ,new Date() ));
	  todos.add(new Todo( ++id , "rewati", "Learn React" ,false, new Date() ,new Date() ));
	  todos.add(new Todo( ++id , "rewati", "Learn Angular" ,false, new Date() ,new Date() ));
	  
  }
  public List<Todo> findAll(){
	  return todos;
  }
  
  public List<Todo> deleteById(long id) {
		Todo todo = findById(id);
		if(todo == null)return null;
		if(todos.remove(todo))return todos;
		return null;
  }
  private Todo findById(long id) {
	  for(Todo todo:todos) {
		  if(todo.getId() == id) {
			  return todo;
		  }
	  }
	  return null;
  };
}
