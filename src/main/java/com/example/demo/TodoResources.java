package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TodoResources {
@Autowired	
private TodoHardCordService todohard;

 @GetMapping("/users/{username}/todos")
 public List<Todo> getAllTodos(@PathVariable String username){
	return todohard.findAll();
 }
@DeleteMapping("/users/{username}/todos/{id}")
public ResponseEntity<Void> deleteById(@PathVariable long id, @PathVariable String username){
	  List<Todo> todo = todohard.deleteById(id);
	  if(todo != null) {
		  return ResponseEntity.ok().build();
	  }
	return ResponseEntity.notFound().build();
 }
};

