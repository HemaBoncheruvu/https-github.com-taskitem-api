# TaskItem Backend Application

This is a simple Spring Boot backend application that exposes REST APIs to manage a collection of tasks.
The application uses an in-memory data store and does not require any database.

## Technologies Used
- Java
- Spring Boot
- Maven

## How to Run
1. Import the project into IntelliJ IDEA
2. Make sure Java is installed
3. Run `TaskitemApplication.java`
4. Application will start on port 8080

## API Endpoints

### Add a new task
POST /api/tasks

Request Body:
{
"title": "Sample task",
"description": "Description of the task"
}

### Get task by ID
GET /api/tasks/{id}

## Notes
- Data is stored in memory using an ArrayList
- Data will be lost when the application restarts
- This design keeps the application simple and lightweight
