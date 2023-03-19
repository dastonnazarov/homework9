package org.example.hotel.assissEntity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "workShift")
public class WorkShift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "daytime")
    private String daytime;

    @Column(name = "evening")
    private String evening;



}
