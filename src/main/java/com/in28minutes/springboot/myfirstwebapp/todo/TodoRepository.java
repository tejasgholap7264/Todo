package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
    public List<Todo> findByUsername(String username);
}

//repository is used to perform action on entities which is a interface
//To manage the Todo entity we extends JpaRepository
                         //<What bean we have to managing(Todo bean),
                          //What is the type of the ID field>
//Using Reposioty we can perform lot of operation