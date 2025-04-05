package com.crud.curd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "crud")
@NoArgsConstructor
@AllArgsConstructor
public class CRUD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 식별자

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "content", length = 100)
    private String content;
}
