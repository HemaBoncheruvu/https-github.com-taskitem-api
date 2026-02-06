package com.example.taskitem.model;
import jakarta.validation.constraints.NotBlank;

public class TaskItem {

    private int id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    public TaskItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
