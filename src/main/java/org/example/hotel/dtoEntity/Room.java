package org.example.hotel.dtoEntity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.hotel.enums.RoomType;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private RoomType type;

    @Column(name = "price")
    private Double price;

    @Column(name = "area")
    private Double area;

}
