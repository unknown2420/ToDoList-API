package com.todo.ToDoList.repository;

import com.todo.ToDoList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
