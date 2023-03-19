package org.example.hotel.assissEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "outCome")
public class OutCome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "communal")
    private Double communal;

    @Column(name = "internet")
    private Double internet;

    @Column(name = "employeeSalary")
    private Double employeeSalary;

    @Column(name = "others")
    private Double others;


}
