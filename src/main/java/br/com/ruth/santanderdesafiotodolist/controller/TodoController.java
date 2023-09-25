package br.com.ruth.santanderdesafiotodolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ruth.santanderdesafiotodolist.entity.Todo;
import br.com.ruth.santanderdesafiotodolist.service.TodoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> criar(@RequestBody @Valid Todo todo) {
        return todoService.criar(todo);
    }

    @GetMapping
    List<Todo> listar() {
        return todoService.listar();
    }

    @PutMapping
    List<Todo> atualizar(@RequestBody Todo todo) {
        return todoService.atualizar(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> deletar(@PathVariable("id") Long id) {
        return todoService.deletar(id);
    }
}
