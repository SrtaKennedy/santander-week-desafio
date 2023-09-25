package br.com.ruth.santanderdesafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ruth.santanderdesafiotodolist.entity.Todo;

public interface TodoRepositoty extends JpaRepository<Todo, Long>{
    
}
