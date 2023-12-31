package com.example.todoapp.dto;

import com.example.todoapp.entity.Todo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class TodoResponseDto {
    private Long id;
    private String username;
//    private String password;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public Boolean getCompletedTodo() {
        return isCompletedTodo == null ? Boolean.FALSE : isCompletedTodo;
    }

    private Boolean isCompletedTodo = Boolean.FALSE;


    public TodoResponseDto(Todo todo) {
        this.id = todo.getId();
        this.username = todo.getUsername();
//        this.password = todo.getPassword();
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.createdAt = todo.getCreatedAt();
        this.modifiedAt = todo.getModifiedAt();
        this.isCompletedTodo = todo.getIsCompletedTodo();
    }
}
