package com.blogapp12.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

     @Column(length = 60)
    private String name;
}
