package br.com.ruth.santanderdesafiotodolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.com.ruth.santanderdesafiotodolist.entity.Todo;
import br.com.ruth.santanderdesafiotodolist.repository.TodoRepositoty;

@Service
public class TodoService {
    private TodoRepositoty todoRepositoty;

    public TodoService(TodoRepositoty todoRepositoty) {
        this.todoRepositoty = todoRepositoty;
    }

    public List<Todo> criar(Todo todo) {
        todoRepositoty.save(todo);
        return listar();
    }

    public List<Todo> listar() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepositoty.findAll(sort);
    }

    public List<Todo> atualizar(Todo todo) {
        todoRepositoty.save(todo);
        return listar();
    }

    public List<Todo> deletar(Long id) {
        todoRepositoty.deleteById(id);
        return listar();
    }
}
