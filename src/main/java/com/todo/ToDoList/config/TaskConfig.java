package com.todo.ToDoList.config;

import com.todo.ToDoList.model.Task;
import com.todo.ToDoList.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class TaskConfig {

    CommandLineRunner commandLineRunner(TaskRepository taskRepository){
        return args -> {
            Task task = new Task(
                    "Set up Project Files",
                    "Set up the Project file structure",
                    true,
                    LocalDate.of(2023, Month.JULY, 24)
            );
            Task task1 = new Task(
                    "Set up API",
                    "Make an API endpoint that allows you to get all tasks",
                    true,
                    LocalDate.of(2023, Month.JULY, 24)
            );
            Task task2 = new Task(
                    "Work on Create a task",
                    "Make an API endpoint that allows you to create a task",
                    false,
                    LocalDate.of(2023, Month.JULY, 25)
            );
            Task task3 = new Task(
                    "Work on Updating a task",
                    "Make an API endpoint that allows you update a task based on the ID",
                    false,
                    LocalDate.of(2023, Month.JULY, 26)
            );
            Task task4 = new Task(
                    "Work on Deleting a task",
                    "Make an API endpoint that allows you to delete a task based on the ID",
                    false,
                    LocalDate.of(2023, Month.JULY, 28)
            );

        };
    }
}
