package com.todo.ToDoList.service;

import com.todo.ToDoList.exception.TaskNotFoundException;
import com.todo.ToDoList.model.Task;
import com.todo.ToDoList.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    /**
     * Get method that returns all tasks
     * @return
     */
    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

    /**
     * Adding a task to the database
     * @param task
     */
    public void addTodo(Task task){
        taskRepository.save(task);
    }

    /**
     * Getting a task by its Id
     */
    public Task getTaskById(Long id){
        return taskRepository.findById(id)
                .orElseThrow(() ->
                        new TaskNotFoundException(id));
    }


}
