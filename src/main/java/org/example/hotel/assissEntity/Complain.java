package org.example.hotel.assissEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
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

    @Column(name = "employee_id")
    private Integer employee_id;

    @Column(name = "guest_id")
    private Integer guest_id;

    @Column(name = "status")
    private ComplainStatus status;
}
