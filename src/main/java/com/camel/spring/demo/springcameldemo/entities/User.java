package com.camel.spring.demo.springcameldemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "tbl_users")
public class User {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "serial")
    private Long id;

    @Getter
    @Setter
    @NotNull
    @Size(max=255)
    @Column
    private String name;

    @Getter
    @Setter
    @OneToMany(mappedBy = "user")
    @Column(name = "alerts")
    private List<Alert> alerts;

}
