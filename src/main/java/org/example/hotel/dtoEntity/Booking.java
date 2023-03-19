package org.example.hotel.dtoEntity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "guest_id")
    private Integer guest_id;

    @Column(name = "room_id")
    private Integer room_id;

    @Column(name = "bookingDate")
    private LocalDate bookingDate;

    @Column(name = "countOfDay")
    private Integer countOfDay;

    @Column(name = "bookingPrice")
    private Double bookingPrice;


}
