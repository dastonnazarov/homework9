package org.example.hotel.assissEntity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "cleaningRoom")
public class CleaningRoom {
    @Column(name = "room_id")
    private Integer room_id;

    @Column(name = "employee_id")
    private Integer employee_id;

    @Column(name = "cleaningTime")
    private LocalDate cleaningTime;

    @Column(name = "text")
    private String text;

}
