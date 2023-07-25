ToDo List API Documentation
TaskController
The TaskController class is responsible for handling HTTP requests related to tasks. It interacts with the TaskService to perform CRUD operations on tasks.

Endpoints
GET /api/v1/tasks
Description: Retrieve all tasks.
Returns: A list of all tasks.

GET /api/v1/tasks/{id}
Description: Retrieve a specific task by its ID.
Parameters:

id (Long) - The ID of the task to retrieve.
Returns: The task with the specified ID if found.
POST /api/v1/tasks
Description: Create a new task.
Payload: A JSON object representing the new task to be created.
Returns: No response body.

PUT /api/v1/tasks/{id}
Description: Update a task by its ID.
Parameters:

id (Long) - The ID of the task to update.
Payload: A JSON object representing the updated task.
Returns: The updated task if successful.
DELETE /api/v1/tasks/{id}
Description: Delete a task by its ID.
Parameters:

id (Long) - The ID of the task to delete.
Returns: No response body.
Task
The Task class represents a task entity in the application. It is a JPA entity and corresponds to the database table for tasks.

Fields
id (Long) - The unique identifier of the task.
title (String) - The title of the task.
description (String) - The description of the task.
status (boolean) - The status of the task (true for completed, false for incomplete).
date (LocalDate) - The date associated with the task.
TaskRepository
The TaskRepository interface is a Spring Data JPA repository responsible for database operations related to tasks.

TaskService
The TaskService class contains business logic for managing tasks. It interacts with the TaskRepository to perform CRUD operations on tasks.

Methods
getTasks()
Description: Retrieve all tasks.
Returns: A list of all tasks.

addTodo(Task task)
Description: Create a new task.
Parameters:

task (Task) - The new task to be created.
Returns: No return value.
getTaskById(Long id)
Description: Retrieve a specific task by its ID.
Parameters:

id (Long) - The ID of the task to retrieve.
Returns: The task with the specified ID if found.
updateTask(Task newTask, Long id)
Description: Update a task by its ID.
Parameters:

newTask (Task) - The updated task.
id (Long) - The ID of the task to update.
Returns: The updated task if successful.
deleteTask(Long id)
Description: Delete a task by its ID.
Parameters:

id (Long) - The ID of the task to delete.
Returns: No return value.
TaskNotFoundException
The TaskNotFoundException class is an exception thrown when a task is not found in the database.

TaskConfig
The TaskConfig class is a configuration class responsible for initializing some sample tasks in the database using CommandLineRunner.

Sample Tasks
The following sample tasks are created during application startup:

Title: Set up Project Files
Description: Set up the Project file structure
Status: Completed
Date: July 24, 2023

Title: Set up API
Description: Make an API endpoint that allows you to get all tasks
Status: Completed
Date: July 24, 2023

Title: Work on Create a task
Description: Make an API endpoint that allows you to create a task
Status: Incomplete
Date: July 25, 2023

Title: Work on Updating a task
Description: Make an API endpoint that allows you update a task based on the ID
Status: Incomplete
Date: July 26, 2023

Title: Work on Deleting a task
Description: Make an API endpoint that allows you to delete a task based on the ID
Status: Incomplete
Date: July 28, 2023
