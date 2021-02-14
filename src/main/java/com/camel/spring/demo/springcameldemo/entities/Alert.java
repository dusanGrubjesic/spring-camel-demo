package com.camel.spring.demo.springcameldemo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tbl_alerts")
public class Alert {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "serial")
    private Long id;

    @Getter
    @Setter
    private boolean fired;

    @Getter
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
