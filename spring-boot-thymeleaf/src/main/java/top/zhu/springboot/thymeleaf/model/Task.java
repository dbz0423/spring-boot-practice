package top.zhu.springboot.thymeleaf.model;

import lombok.Data;

@Data
public class Task {
    private Long id;
    private String name;
    private Boolean completed;

    public Task(Long id, String name) {
        this.id = id;
        this.name = name;
        this.completed = false;
    }
}
