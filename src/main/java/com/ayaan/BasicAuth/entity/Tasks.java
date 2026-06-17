package com.ayaan.BasicAuth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tasks_id;

    @Column(nullable = false)
    private String tasksName;

    @Column(nullable = false)
    private String tasksDescription;

    @Enumerated(EnumType.STRING)
    private TaskCompletion status = TaskCompletion.NOT_COMPLETED;

    @ManyToOne
    @JoinColumn(name = "user_user_id")
    private Users user;
}
