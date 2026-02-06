package com.example.taskitem.service;

import com.example.taskitem.model.TaskItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {


    private final List<TaskItem> tasks = new ArrayList<>();
    private int idCounter = 1;

    public TaskItem addTask(TaskItem task) {
        task.setId(idCounter++);
        tasks.add(task);
        return task;
    }

    public TaskItem getTaskById(int id) {
        for (TaskItem task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
