package com.example.taskitem.controller;

import com.example.taskitem.model.TaskItem;
import com.example.taskitem.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping
    public ResponseEntity<TaskItem> addTask(@Valid @RequestBody TaskItem task) {
        TaskItem savedTask = taskService.addTask(task);
        return ResponseEntity.ok(savedTask);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getTaskById(@PathVariable int id) {
        TaskItem task = taskService.getTaskById(id);

        if (task == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }
}
