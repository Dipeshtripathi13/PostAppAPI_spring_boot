package com.example.demo.models;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private String name;
    

    public Task() {
        // Default constructor
    }

    public Task(String task, String name) {
        this.task = task;
        
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    public String getName() {
    	return name;
    }
    public void setName() {
    	this.name = name;
    }

//    public boolean isCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(boolean completed) {
//        this.completed = completed;
//    }

    // Override toString() method for better debugging
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", name='" + name + '\'' +
               // ", completed='" + completed +
                "'}";
    }
}
