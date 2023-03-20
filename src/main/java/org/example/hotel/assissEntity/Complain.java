package org.example.hotel.assissEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.hotel.dtoEntity.Employee;
import org.example.hotel.dtoEntity.Guest;
import org.example.hotel.enums.ComplainStatus;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "complain")
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Employee employee;

    private Guest guest;

    @Column(name = "status")
    private ComplainStatus status;
}
