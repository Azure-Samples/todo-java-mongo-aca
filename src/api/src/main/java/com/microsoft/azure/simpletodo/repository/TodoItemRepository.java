package com.microsoft.azure.simpletodo.repository;

import com.microsoft.azure.simpletodo.model.TodoItem;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends PagingAndSortingRepository<TodoItem, String> {
    TodoItem deleteTodoItemByListIdAndId(String listId, String itemId);

    List<TodoItem> findTodoItemsByListId(String listId);

    List<TodoItem> findTodoItemsById(String id);

    Optional<TodoItem> findTodoItemByListIdAndId(String listId, String id);

    List<TodoItem> findTodoItemsByListIdAndState(String listId, String state);

    TodoItem save(TodoItem todoItem);

    TodoItem save(List<TodoItem> todoItem);
}
