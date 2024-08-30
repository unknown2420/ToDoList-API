# ToDo List API Documentation

## Overview

This documentation provides an overview of the ToDo List API, detailing its functionality, endpoints, and key classes. The API allows users to manage tasks through standard CRUD operations.

## TaskController

The `TaskController` class handles HTTP requests related to task management. It utilizes the `TaskService` to perform operations such as creating, reading, updating, and deleting tasks.

### Endpoints

#### GET `/api/v1/tasks`
- **Description:** Retrieve all tasks.
- **Returns:** A list of all tasks.

#### GET `/api/v1/tasks/{id}`
- **Description:** Retrieve a specific task by its ID.
- **Parameters:**
  - `id` (Long): The ID of the task to retrieve.
- **Returns:** The task with the specified ID if found.

#### POST `/api/v1/tasks`
- **Description:** Create a new task.
- **Payload:** A JSON object representing the new task.
- **Returns:** No response body.

#### PUT `/api/v1/tasks/{id}`
- **Description:** Update a task by its ID.
- **Parameters:**
  - `id` (Long): The ID of the task to update.
- **Payload:** A JSON object representing the updated task.
- **Returns:** The updated task if successful.

#### DELETE `/api/v1/tasks/{id}`
- **Description:** Delete a task by its ID.
- **Parameters:**
  - `id` (Long): The ID of the task to delete.
- **Returns:** No response body.

## Task

The `Task` class represents a task entity within the application. This class is a JPA entity, mapping to a database table that stores task data.

### Fields

- **id** (Long): The unique identifier of the task.
- **title** (String): The title of the task.
- **description** (String): A brief description of the task.
- **status** (boolean): The status of the task (`true` for completed, `false` for incomplete).
- **date** (LocalDate): The date associated with the task.

## TaskRepository

The `TaskRepository` interface extends Spring Data JPA to handle database operations related to tasks. It provides an abstraction over standard CRUD operations.

## TaskService

The `TaskService` class encapsulates business logic for managing tasks. It interacts with the `TaskRepository` to perform various operations.

### Methods

- **getTasks()**
  - **Description:** Retrieve all tasks.
  - **Returns:** A list of all tasks.

- **addTodo(Task task)**
  - **Description:** Create a new task.
  - **Parameters:** 
    - `task` (Task): The new task to be created.
  - **Returns:** No return value.

- **getTaskById(Long id)**
  - **Description:** Retrieve a specific task by its ID.
  - **Parameters:**
    - `id` (Long): The ID of the task to retrieve.
  - **Returns:** The task with the specified ID if found.

- **updateTask(Task newTask, Long id)**
  - **Description:** Update a task by its ID.
  - **Parameters:** 
    - `newTask` (Task): The updated task.
    - `id` (Long): The ID of the task to update.
  - **Returns:** The updated task if successful.

- **deleteTask(Long id)**
  - **Description:** Delete a task by its ID.
  - **Parameters:** 
    - `id` (Long): The ID of the task to delete.
  - **Returns:** No return value.

## TaskNotFoundException

The `TaskNotFoundException` class is a custom exception thrown when a task cannot be found in the database.

## TaskConfig

The `TaskConfig` class serves as a configuration class that initializes the database with sample tasks using the `CommandLineRunner`.

### Sample Tasks

The following sample tasks are initialized when the application starts:

1. **Title:** Set up Project Files
   - **Description:** Set up the project file structure.
   - **Status:** Completed
   - **Date:** July 24, 2023

2. **Title:** Set up API
   - **Description:** Create an API endpoint to retrieve all tasks.
   - **Status:** Completed
   - **Date:** July 24, 2023

3. **Title:** Work on Create a Task
   - **Description:** Create an API endpoint to create a new task.
   - **Status:** Incomplete
   - **Date:** July 25, 2023

4. **Title:** Work on Updating a Task
   - **Description:** Create an API endpoint to update a task by ID.
   - **Status:** Incomplete
   - **Date:** July 26, 2023

5. **Title:** Work on Deleting a Task
   - **Description:** Create an API endpoint to delete a task by ID.
   - **Status:** Incomplete
   - **Date:** July 28, 2023
