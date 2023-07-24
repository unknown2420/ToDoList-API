package com.todo.ToDoList.controller;

import com.todo.ToDoList.model.Task;
import com.todo.ToDoList.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTask();
    }
}
