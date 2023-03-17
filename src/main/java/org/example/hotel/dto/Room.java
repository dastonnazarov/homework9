package org.example.hotel.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.hotel.enums.RoomType;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Getter
@Setter
@ToString
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer number;

    @Column(name = "floor")
    private String floor;

    @Column(name = "type")
    private RoomType type;


}
