package com.microsoft.azure.simpletodo.repository;

import com.microsoft.azure.simpletodo.model.TodoList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoListRepository extends PagingAndSortingRepository<TodoList, String> {
    Optional<TodoList> findById(final String id);

    TodoList save(final TodoList todoList);

    TodoList deleteTodoListById(String id);
}
