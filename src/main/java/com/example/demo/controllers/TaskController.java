package com.example.demo.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/posts")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")
	public ResponseEntity<List<Task>> getAllTasks() {
		System.out.print(taskService.getAllTask());
		return ResponseEntity.ok(taskService.getAllTask());
	}

	@PostMapping("/")
	public ResponseEntity<Task> createTask(@RequestBody Task task) {
		return ResponseEntity.ok(taskService.createNewTask(task));
	}
	@PutMapping("/{id}")
	public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
		task.setId(id);
		return ResponseEntity.ok(taskService.updateTask(task));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteTask(@PathVariable Long id) {
	    taskService.deleteTask(id);
	    return ResponseEntity.ok(true);
	}
}
